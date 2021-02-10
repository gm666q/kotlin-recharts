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

package recharts.cartesian.cartesiangrid

import org.w3c.dom.svg.SVGLineElement
import react.ReactElement
import react.SVGProps
import recharts.kotlin.Union

sealed class GridLineType(name: String, ordinal: Int) : Union<GridLineType>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : GridLineType("Boolean", 0)
    data class Function(val value: (props: Any) -> react.ReactElement/*<SVGElement>*/) : GridLineType("Function", 1)
    data class SVGProps(val value: react.SVGProps<SVGLineElement>) :
        GridLineType("PresentationAttributes", 2)

    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : GridLineType("ReactElement", 3)

    companion object {
        fun valueOf(value: String): GridLineType {
            throw IllegalArgumentException()
        }

        fun values(): Array<GridLineType> {
            return arrayOf()
        }
    }
}

fun Boolean.toGridLineType() = GridLineType.Boolean(this)
fun ((props: Any) -> ReactElement/*<SVGElement>*/).toGridLineType() = GridLineType.Function(this)
fun SVGProps<SVGLineElement>.toGridLineType() = GridLineType.SVGProps(this)
fun ReactElement/*<SVGElement>*/.toGridLineType() = GridLineType.ReactElement(this)
