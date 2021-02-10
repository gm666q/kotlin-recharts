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
import recharts.util.types.DataKey
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DataKeyOrNullProp<T> : ReadWriteProperty<RechartsProps, DataKey<T>?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>): DataKey<T>? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is (obj: T) -> Any -> DataKey.Function(value)
            is Number -> DataKey.Number(value)
            is String -> DataKey.String(value)
            else -> null
        }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: DataKey<T>?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is DataKey.Function -> value.value
            is DataKey.Number -> value.value
            is DataKey.String -> value.value
            null -> null
        }
    }
}
