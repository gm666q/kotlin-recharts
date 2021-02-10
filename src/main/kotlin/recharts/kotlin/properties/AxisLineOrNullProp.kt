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

import recharts.util.types.AxisLine
import recharts.util.types.BaseAxisProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisLineOrNullProp : ReadWriteProperty<BaseAxisProps, AxisLine?> {
    override fun getValue(thisRef: BaseAxisProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> AxisLine.Boolean(value)
            //is PresentationAttributes<SVGLineElement> -> AxisLine.PresentationAttributes(value as PresentationAttributes<SVGLineElement>)
            else -> null
        }

    override fun setValue(thisRef: BaseAxisProps, property: KProperty<*>, value: AxisLine?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AxisLine.Boolean -> value.value
            is AxisLine.SVGProps -> value.value
            null -> null
        }
    }
}