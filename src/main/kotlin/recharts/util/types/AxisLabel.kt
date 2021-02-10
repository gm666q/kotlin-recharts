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

import kotlinext.js.Object
import react.ReactElement
import recharts.kotlin.Union

sealed class AxisLabel(name: kotlin.String, ordinal: Int) : Union<AxisLabel>(name, ordinal) {
    data class Number(val value: kotlin.Number) : AxisLabel("Number", 0)
    data class Object(val value: kotlinext.js.Object) : AxisLabel("Object", 1)
    data class ReactElement(val value: react.ReactElement) : AxisLabel("ReactElement", 2)
    data class String(val value: kotlin.String) : AxisLabel("String", 3)

    companion object {
        fun valueOf(value: kotlin.String): AxisLabel {
            throw IllegalArgumentException()
        }

        fun values(): Array<AxisLabel> = arrayOf()
    }
}

fun Number.toAxisLabel() = AxisLabel.Number(this)
fun Object.toAxisLabel() = AxisLabel.Object(this)
fun ReactElement.toAxisLabel() = AxisLabel.ReactElement(this)
fun String.toAxisLabel() = AxisLabel.String(this)
