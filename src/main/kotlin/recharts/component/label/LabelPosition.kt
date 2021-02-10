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

package recharts.component.label

import recharts.kotlin.Union

@Suppress("ClassName")
sealed class LabelPosition(name: String, ordinal: Int) : Union<LabelPosition>(name, ordinal) {
    data class Object(val value: LabelPositionObject) : LabelPosition("Object", 0)
    object bottom : LabelPosition("bottom", 1)
    object center : LabelPosition("center", 2)
    object centerBottom : LabelPosition("centerBottom", 3)
    object centerTop : LabelPosition("centerTop", 4)
    object end : LabelPosition("end", 5)
    object left : LabelPosition("left", 6)
    object inside : LabelPosition("inside", 7)
    object insideBottom : LabelPosition("insideBottom", 8)
    object insideBottomLeft : LabelPosition("insideBottomLeft", 9)
    object insideBottomRight : LabelPosition("insideBottomRight", 10)
    object insideEnd : LabelPosition("insideEnd", 11)
    object insideLeft : LabelPosition("insideLeft", 12)
    object insideRight : LabelPosition("insideRight", 13)
    object insideStart : LabelPosition("insideStart", 14)
    object insideTop : LabelPosition("insideTop", 15)
    object insideTopLeft : LabelPosition("insideTopLeft", 16)
    object insideTopRight : LabelPosition("insideTopRight", 17)
    object middle : LabelPosition("middle", 18)
    object outside : LabelPosition("outside", 19)
    object right : LabelPosition("right", 20)
    object top : LabelPosition("top", 21)

    companion object {
        fun valueOf(value: String): LabelPosition = when (value) {
            bottom.name -> bottom
            center.name -> center
            centerBottom.name -> centerBottom
            centerTop.name -> centerTop
            end.name -> end
            left.name -> left
            inside.name -> inside
            insideBottom.name -> insideBottom
            insideBottomLeft.name -> insideBottomLeft
            insideBottomRight.name -> insideBottomRight
            insideEnd.name -> insideEnd
            insideLeft.name -> insideLeft
            insideRight.name -> insideRight
            insideStart.name -> insideStart
            insideTop.name -> insideTop
            insideTopLeft.name -> insideTopLeft
            insideTopRight.name -> insideTopRight
            middle.name -> middle
            outside.name -> outside
            right.name -> right
            top.name -> top
            else -> throw IllegalArgumentException()
        }

        fun values(): Array<LabelPosition> = arrayOf(
            bottom,
            center,
            centerBottom,
            centerTop,
            end,
            left,
            inside,
            insideBottom,
            insideBottomLeft,
            insideBottomRight,
            insideEnd,
            insideLeft,
            insideRight,
            insideStart,
            insideTop,
            insideTopLeft,
            insideTopRight,
            middle,
            outside,
            right,
            top
        )
    }
}

fun LabelPositionObject.toLabelPosition() = LabelPosition.Object(this)
