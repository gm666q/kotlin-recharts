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

sealed class AxisScale(name: String, ordinal: Int) : Union<AxisScale>(name, ordinal) {
    data class Function(val value: kotlin.Function<*>) : AxisScale("Function", 0)
    data class ScaleType(val value: recharts.util.types.ScaleType) : AxisScale("ScaleType", 1)

    companion object {
        fun valueOf(value: String): AxisScale {
            throw IllegalArgumentException()
        }

        fun values(): Array<AxisScale> = arrayOf()
    }
}

fun Function<*>.toAxisScale() = AxisScale.Function(this)
fun ScaleType.toAxisScale() = AxisScale.ScaleType(this)
