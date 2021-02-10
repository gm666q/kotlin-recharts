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

package recharts.cartesian.bar

import org.w3c.dom.svg.SVGElement
import react.ReactElement
import recharts.kotlin.Union
import recharts.shape.rectangle.Props

sealed class RectangleShapeType(name: String, ordinal: Int) : Union<RectangleShapeType>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : RectangleShapeType("Boolean", 0)
    data class Function(val value: (props: Any) -> SVGElement) : RectangleShapeType("Function", 1)
    data class ReactElement(val value: react.ReactElement) : RectangleShapeType("ReactElement", 2)
    data class RectangleProps(val value: Props) :
        RectangleShapeType("RectangleProps", 3)

    companion object {
        fun valueOf(value: String): RectangleShapeType {
            throw IllegalArgumentException()
        }

        fun values(): Array<RectangleShapeType> = arrayOf()
    }
}

fun Boolean.toRectangleShapeType() = RectangleShapeType.Boolean(this)
fun ((props: Any) -> SVGElement).toRectangleShapeType() = RectangleShapeType.Function(this)
fun ReactElement.toRectangleShapeType() = RectangleShapeType.ReactElement(this)
fun Props.toRectangleShapeType() = RectangleShapeType.RectangleProps(this)
