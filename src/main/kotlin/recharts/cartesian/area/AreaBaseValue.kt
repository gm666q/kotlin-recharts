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

package recharts.cartesian.area

import recharts.kotlin.Union

@Suppress("ClassName")
sealed class AreaBaseValue(name: String, ordinal: Int) : Union<AreaBaseValue>(name, ordinal) {
    data class Number(val value: kotlin.Number) : AreaBaseValue("Number", 0)
    object dataMax : AreaBaseValue("dataMax", 1)
    object dataMin : AreaBaseValue("dataMin", 2)

    companion object {
        fun valueOf(value: String): AreaBaseValue = when (value) {
            dataMax.name -> dataMax
            dataMin.name -> dataMin
            else -> throw IllegalArgumentException()
        }

        fun values(): Array<AreaBaseValue> = arrayOf(
            dataMax,
            dataMin
        )
    }
}

fun Number.toAreaBaseValue() = AreaBaseValue.Number(this)
