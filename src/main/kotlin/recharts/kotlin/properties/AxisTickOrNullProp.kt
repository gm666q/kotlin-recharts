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
import recharts.util.types.AxisTick
import recharts.util.types.BaseAxisProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisTickOrNullProp : ReadWriteProperty<BaseAxisProps, AxisTick?> {
    override fun getValue(thisRef: BaseAxisProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> AxisTick.Boolean(value)
            is (props: Any) -> SVGElement -> AxisTick.Function(value)
            //is PresentationAttributes<SVGTextElement> -> AxisTick.PresentationAttributes(value as PresentationAttributes<SVGTextElement>)
            //is ReactElement -> AxisTick.ReactElement(value as ReactElement)
            else -> null
        }

    override fun setValue(thisRef: BaseAxisProps, property: KProperty<*>, value: AxisTick?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AxisTick.Boolean -> value.value
            is AxisTick.Function -> value.value
            is AxisTick.ReactElement -> value.value
            is AxisTick.SVGProps -> value.value
            null -> null
        }
    }
}
