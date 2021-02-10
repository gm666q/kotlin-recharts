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

package recharts.kotlin

sealed class NumberOrString(name: kotlin.String, ordinal: Int) : Union<NumberOrString>(name, ordinal) {
    data class Number(val value: kotlin.Number) : NumberOrString("Number", 0)
    data class String(val value: kotlin.String) : NumberOrString("String", 1)

    companion object {
        fun valueOf(value: kotlin.String): NumberOrString {
            throw IllegalArgumentException()
        }

        fun values(): Array<NumberOrString> {
            return arrayOf()
        }
    }
}

fun Number.toNumberOrString() = NumberOrString.Number(this)
fun String.toNumberOrString() = NumberOrString.String(this)
