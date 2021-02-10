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

import org.w3c.dom.svg.SVGLineElement
import react.SVGProps
import recharts.kotlin.Union

sealed class AxisLine(name: String, ordinal: Int) : Union<AxisLine>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : AxisLine("Boolean", 0)
    data class SVGProps(val value: react.SVGProps<SVGLineElement>) : AxisLine("SVGProps", 1)

    companion object {
        fun valueOf(value: String): AxisLine {
            throw IllegalArgumentException()
        }

        fun values(): Array<AxisLine> = arrayOf()
    }
}

fun Boolean.toAxisLine() = AxisLine.Boolean(this)
fun SVGProps<SVGLineElement>.toAxisLine() = AxisLine.SVGProps(this)
