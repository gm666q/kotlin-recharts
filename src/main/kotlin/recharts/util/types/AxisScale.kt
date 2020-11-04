package recharts.util.types

import recharts.kotlin.Union

sealed class AxisScale(name: String, ordinal: Int) : Union<AxisScale>(name, ordinal) {
    data class Function(val value: kotlin.Function<*>) : AxisScale("Function", 0)
    data class ScaleType(val value: recharts.util.types.ScaleType) : AxisScale("ScaleType", 1)

    companion object {
        fun valueOf(value: String): AxisScale {
            throw IllegalArgumentException()
        }

        fun values(): Array<AxisScale> = arrayOf()
    }
}

fun Function<*>.toAxisScale() = AxisScale.Function(this)
fun ScaleType.toAxisScale() = AxisScale.ScaleType(this)
