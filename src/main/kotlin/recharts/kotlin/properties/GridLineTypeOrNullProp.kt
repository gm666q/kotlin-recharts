/*
 * Copyright 2020-2021 Jan Śmiałkowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package recharts.kotlin.properties

import org.w3c.dom.svg.SVGElement
import recharts.cartesian.cartesiangrid.CartesianGridProps
import recharts.cartesian.cartesiangrid.GridLineType
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class GridLineTypeOrNullProp : ReadWriteProperty<CartesianGridProps, GridLineType?> {
    override fun getValue(thisRef: CartesianGridProps, property: KProperty<*>): GridLineType? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> GridLineType.Boolean(value)
            is (props: Any) -> SVGElement -> GridLineType.Function(value)
            //is SVGProps<SVGLineElement> -> GridLineType.SVGProps(value as SVGProps<SVGLineElement>)
            //is ReactElement/*<SVGElement>*/ -> GridLineType.ReactElement(value as ReactElement/*<SVGElement>*/)
            else -> null
        }

    override fun setValue(thisRef: CartesianGridProps, property: KProperty<*>, value: GridLineType?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is GridLineType.Boolean -> value.value
            is GridLineType.Function -> value.value
            is GridLineType.SVGProps -> value.value
            is GridLineType.ReactElement -> value.value
            null -> null
        }
    }
}
