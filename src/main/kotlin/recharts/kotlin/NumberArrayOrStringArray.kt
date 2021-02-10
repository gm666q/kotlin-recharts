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

sealed class NumberArrayOrStringArray(name: kotlin.String, ordinal: Int) : Union<NumberOrString>(name, ordinal) {
    data class NumberArray(val value: Array<Number>) : NumberArrayOrStringArray("NumberArray", 0) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class.js != other::class.js) return false
            if (!super.equals(other)) return false

            other as NumberArray

            if (!value.contentEquals(other.value)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = super.hashCode()
            result = 31 * result + value.contentHashCode()
            return result
        }
    }

    data class StringArray(val value: Array<String>) : NumberArrayOrStringArray("StringArray", 1) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class.js != other::class.js) return false
            if (!super.equals(other)) return false

            other as StringArray

            if (!value.contentEquals(other.value)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = super.hashCode()
            result = 31 * result + value.contentHashCode()
            return result
        }
    }
}

fun Array<Number>.toNumberArrayOrStringArray() = NumberArrayOrStringArray.NumberArray(this)
fun Array<String>.toNumberArrayOrStringArray() = NumberArrayOrStringArray.StringArray(this)
