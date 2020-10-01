package recharts.util.types

import kotlinx.html.AttributeEnum

@Suppress("EnumEntryName")
enum class AnimationTiming(override val realValue: String) : AttributeEnum {
    ease("ease"),
    easeIn("ease-in"),
    easeInOut("ease-in-out"),
    easeOut("ease-out"),
    linear("linear");

    override fun toString(): String = realValue

    companion object {
        fun realValueOf(value: String): AnimationTiming {
            return when (value) {
                ease.realValue -> ease
                easeIn.realValue -> easeIn
                easeInOut.realValue -> easeInOut
                easeOut.realValue -> easeOut
                linear.realValue -> linear
                else -> throw IllegalArgumentException()
            }
        }
    }
}