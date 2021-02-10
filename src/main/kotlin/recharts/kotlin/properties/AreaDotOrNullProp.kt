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

import react.ReactElement
import recharts.cartesian.area.AreaDot
import recharts.cartesian.area.AreaProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AreaDotOrNullProp : ReadWriteProperty<AreaProps, AreaDot?> {
    override fun getValue(thisRef: AreaProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> AreaDot.Boolean(value)
            //is Props -> AreaDot.DotProps(value as Props)
            //is ReactElement -> AreaDot.ReactElement(value as ReactElement)
            is (props: Any) -> ReactElement -> AreaDot.ReactElementFunction(value)
            //is (props: Any) -> SVGElement -> AreaDot.SVGElementFunction(value)
            else -> null
        }

    override fun setValue(thisRef: AreaProps, property: KProperty<*>, value: AreaDot?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AreaDot.Boolean -> value.value
            is AreaDot.DotProps -> value.value
            is AreaDot.ReactElement -> value.value
            is AreaDot.ReactElementFunction -> value.value
            //is AreaDot.SVGElementFunction -> value.value
            null -> null
        }
    }
}
