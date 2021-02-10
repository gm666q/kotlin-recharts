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

@Suppress("ClassName")
sealed class AxisInterval(name: String, ordinal: Int) : Union<AxisInterval>(name, ordinal) {
    data class Number(val value: kotlin.Number) : AxisInterval("Number", 0)
    object preserveEnd : AxisInterval("preserveEnd", 1)
    object preserveStart : AxisInterval("preserveStart", 2)
    object preserveStartEnd : AxisInterval("preserveStartEnd", 3)

    companion object {
        fun valueOf(value: String): AxisInterval = when (value) {
            preserveEnd.name -> preserveEnd
            preserveStart.name -> preserveStart
            preserveStartEnd.name -> preserveStartEnd
            else -> throw IllegalArgumentException()
        }

        fun values(): Array<AxisInterval> = arrayOf(
            preserveEnd,
            preserveStart,
            preserveStartEnd,
        )
    }
}

fun Number.toAxisInterval() = AxisInterval.Number(this)
