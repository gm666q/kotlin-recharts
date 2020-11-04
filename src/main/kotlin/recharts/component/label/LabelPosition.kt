package recharts.component.label

import recharts.kotlin.Union

@Suppress("ClassName")
sealed class LabelPosition(name: String, ordinal: Int) : Union<LabelPosition>(name, ordinal) {
    object bottom : LabelPosition("bottom", 0)
    object center : LabelPosition("center", 1)
    object centerBottom : LabelPosition("centerBottom", 2)
    object centerTop : LabelPosition("centerTop", 3)
    object end : LabelPosition("end", 4)
    object left : LabelPosition("left", 5)
    object inside : LabelPosition("inside", 6)
    object insideBottom : LabelPosition("insideBottom", 7)
    object insideBottomLeft : LabelPosition("insideBottomLeft", 8)
    object insideBottomRight : LabelPosition("insideBottomRight", 9)
    object insideEnd : LabelPosition("insideEnd", 10)
    object insideLeft : LabelPosition("insideLeft", 11)
    object insideRight : LabelPosition("insideRight", 12)
    object insideStart : LabelPosition("insideStart", 13)
    object insideTop : LabelPosition("insideTop", 14)
    object insideTopLeft : LabelPosition("insideTopLeft", 15)
    object insideTopRight : LabelPosition("insideTopRight", 16)
    object outside : LabelPosition("outside", 17)
    object right : LabelPosition("right", 18)
    object top : LabelPosition("top", 19)
    data class Object(val value: LabelPositionObject) : LabelPosition("Object", 20)

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
            outside,
            right,
            top
        )
    }
}

fun LabelPositionObject.toLabelPosition() = LabelPosition.Object(this)
