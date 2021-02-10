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

import org.w3c.dom.svg.SVGTextElement
import react.ReactElement
import react.SVGProps
import recharts.kotlin.Union

sealed class AxisTick(name: String, ordinal: Int) : Union<AxisTick>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : AxisTick("Boolean", 0)
    data class Function(val value: (props: Any) -> react.ReactElement/*<SVGElement>*/) : AxisTick("Function", 1)
    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : AxisTick("ReactElement", 2)
    data class SVGProps(val value: react.SVGProps<SVGTextElement>) :
        AxisTick("SVGProps", 3)

    companion object {
        fun valueOf(value: String): AxisLine {
            throw IllegalArgumentException()
        }

        fun values(): Array<AxisLine> = arrayOf()
    }
}

fun Boolean.toAxisTick() = AxisTick.Boolean(this)
fun ((props: Any) -> ReactElement/*<SVGElement>*/).toAxisTick() = AxisTick.Function(this)
fun ReactElement.toAxisTick() = AxisTick.ReactElement(this)
fun SVGProps<SVGTextElement>.toAxisTick() = AxisTick.SVGProps(this)
