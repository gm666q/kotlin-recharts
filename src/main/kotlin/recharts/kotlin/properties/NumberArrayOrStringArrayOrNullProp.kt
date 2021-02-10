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

import react.RProps
import recharts.kotlin.NumberArrayOrStringArray
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class NumberArrayOrStringArrayOrNullProp : ReadWriteProperty<RProps, NumberArrayOrStringArray?> {
    override fun getValue(thisRef: RProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Array<Number> -> NumberArrayOrStringArray.NumberArray(value)
            is Array<String> -> NumberArrayOrStringArray.StringArray(value)
            else -> null
        }

    override fun setValue(thisRef: RProps, property: KProperty<*>, value: NumberArrayOrStringArray?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is NumberArrayOrStringArray.NumberArray -> value.value
            is NumberArrayOrStringArray.StringArray -> value.value
            null -> null
        }
    }
}