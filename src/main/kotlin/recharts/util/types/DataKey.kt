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

package recharts.util.types

import recharts.kotlin.Union

sealed class DataKey<T>(name: kotlin.String, ordinal: Int) : Union<DataKey<T>>(name, ordinal) {
    data class Function<T>(val value: (obj: T) -> Any) : DataKey<T>("Function", 0)
    data class Number<T>(val value: kotlin.Number) : DataKey<T>("Number", 1)
    data class String<T>(val value: kotlin.String) : DataKey<T>("String", 2)

    companion object {
        fun <T> valueOf(value: kotlin.String): DataKey<T> {
            throw IllegalArgumentException()
        }

        fun <T> values(): Array<DataKey<T>> = arrayOf()
    }
}

fun <T> ((obj: T) -> Any).toDataKey() = DataKey.Function(this)
fun <T> Number.toDataKey() = DataKey.Number<T>(this)
fun <T> String.toDataKey() = DataKey.String<T>(this)
