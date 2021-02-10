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

import recharts.numberaxis.funnel.FunnelActiveIndex
import recharts.numberaxis.funnel.FunnelProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FunnelActiveIndexOrNullProp : ReadWriteProperty<FunnelProps, FunnelActiveIndex?> {
    override fun getValue(thisRef: FunnelProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Array<Number> -> FunnelActiveIndex.NumberArray(value)
            is Number -> FunnelActiveIndex.Number(value)
            else -> null
        }

    override fun setValue(thisRef: FunnelProps, property: KProperty<*>, value: FunnelActiveIndex?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is FunnelActiveIndex.Number -> value.value
            is FunnelActiveIndex.NumberArray -> value.value
            null -> null
        }
    }
}
