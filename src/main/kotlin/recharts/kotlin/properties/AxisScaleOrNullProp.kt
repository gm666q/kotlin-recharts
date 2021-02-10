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

import recharts.kotlin.RechartsProps
import recharts.util.types.AxisScale
import recharts.util.types.ScaleType
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisScaleOrNullProp : ReadWriteProperty<RechartsProps, AxisScale?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Function<*> -> AxisScale.Function(value)
            is String -> try {
                AxisScale.ScaleType(ScaleType.valueOf(value))
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: AxisScale?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AxisScale.Function -> value.value
            is AxisScale.ScaleType -> value.value.name
            null -> null
        }
    }
}
