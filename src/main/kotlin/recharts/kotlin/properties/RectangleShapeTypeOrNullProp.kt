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
import recharts.cartesian.bar.BarProps
import recharts.cartesian.bar.RectangleShapeType
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RectangleShapeTypeOrNullProp : ReadWriteProperty<BarProps, RectangleShapeType?> {
    override fun getValue(thisRef: BarProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> RectangleShapeType.Boolean(value)
            is (props: Any) -> SVGElement -> RectangleShapeType.Function(value)
            //is ReactElement -> RectangleShapeType.ReactElement(value as ReactElement)
            //is Props -> RectangleShapeType.RectangleProps(value as Props)
            else -> null
        }

    override fun setValue(thisRef: BarProps, property: KProperty<*>, value: RectangleShapeType?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is RectangleShapeType.Boolean -> value.value
            is RectangleShapeType.Function -> value.value
            is RectangleShapeType.ReactElement -> value.value
            is RectangleShapeType.RectangleProps -> value.value
            null -> null
        }
    }
}
