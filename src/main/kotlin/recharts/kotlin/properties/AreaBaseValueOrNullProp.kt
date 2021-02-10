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

import recharts.cartesian.area.AreaBaseValue
import recharts.cartesian.area.AreaProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AreaBaseValueOrNullProp : ReadWriteProperty<AreaProps, AreaBaseValue?> {
    override fun getValue(thisRef: AreaProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Number -> AreaBaseValue.Number(value)
            is String -> try {
                AreaBaseValue.valueOf(value)
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: AreaProps, property: KProperty<*>, value: AreaBaseValue?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AreaBaseValue.Number -> value.value
            null -> null
            else -> value.name
        }
    }
}
