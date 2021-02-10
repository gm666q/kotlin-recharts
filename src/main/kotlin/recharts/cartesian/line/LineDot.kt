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

package recharts.cartesian.line

import react.ReactElement
import recharts.kotlin.Union
import recharts.shape.dot.Props

sealed class LineDot(name: String, ordinal: Int) : Union<LineDot>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : LineDot("Boolean", 0)
    data class DotProps(val value: Props) : LineDot("DotProps", 1)
    data class Function(val value: (props: Any) -> react.ReactElement/*<SVGElement>*/) : LineDot("Function", 2)
    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : LineDot("ReactElement", 3)

    companion object {
        fun valueOf(value: String): LineDot {
            throw IllegalArgumentException()
        }

        fun values(): Array<LineDot> {
            return arrayOf()
        }
    }
}

fun Boolean.toLineDot() = LineDot.Boolean(this)
fun Props.toLineDot() = LineDot.DotProps(this)
fun ((props: Any) -> ReactElement/*<SVGElement>*/).toLineDot() = LineDot.Function(this)
fun ReactElement/*<SVGElement>*/.toLineDot() = LineDot.ReactElement(this)
