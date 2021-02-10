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

import react.ReactElement
import recharts.kotlin.Union
import recharts.shape.dot.Props

sealed class AreaDot(name: String, ordinal: Int) : Union<AreaDot>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : AreaDot("Boolean", 0)
    data class DotProps(val value: Props) : AreaDot("DotProps", 1)
    data class ReactElement(val value: react.ReactElement) : AreaDot("ReactElement", 2)
    data class ReactElementFunction(val value: (props: Any) -> react.ReactElement) : AreaDot("ReactElementFunction", 3)
    //data class SVGElementFunction(val value: (props: Any) -> SVGElement) : AreaDot("SVGElementFunction", 4)

    companion object {
        fun valueOf(value: String): AreaDot {
            throw IllegalArgumentException()
        }

        fun values(): Array<AreaDot> = arrayOf()
    }
}

fun Boolean.toAreaDot() = AreaDot.Boolean(this)
fun Props.toAreaDot() = AreaDot.DotProps(this)
fun ReactElement.toAreaDot() = AreaDot.ReactElement(this)
fun ((props: Any) -> ReactElement).toAreaDot() = AreaDot.ReactElementFunction(this)
//fun ((props: Any) -> SVGElement).toAreaDot() = AreaDot.SVGElementFunction(this)
