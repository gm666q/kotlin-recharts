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

package recharts.numberaxis.funnel

import recharts.kotlin.Union

sealed class FunnelActiveIndex(name: String, ordinal: Int) : Union<FunnelActiveIndex>(name, ordinal) {
    data class Number(val value: kotlin.Number) : FunnelActiveIndex("Number", 0)
    data class NumberArray(val value: Array<kotlin.Number>) : FunnelActiveIndex("NumberArray", 1) {
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

    companion object {
        fun valueOf(value: String): FunnelActiveIndex {
            throw IllegalArgumentException()
        }

        fun values(): Array<FunnelActiveIndex> = arrayOf()
    }
}
