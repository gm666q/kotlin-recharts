package recharts.util.types

import recharts.kotlin.Union

@Suppress("ClassName")
sealed class AxisInterval(name: String, ordinal: Int) : Union<AxisInterval>(name, ordinal) {
    data class Number(val value: kotlin.Number) : AxisInterval("Number", 0)
    object preserveEnd : AxisInterval("preserveEnd", 1)
    object preserveStart : AxisInterval("preserveStart", 2)
    object preserveStartEnd : AxisInterval("preserveStartEnd", 3)

    companion object {
        fun valueOf(value: String): AxisInterval = when (value) {
            preserveEnd.name -> preserveEnd
            preserveStart.name -> preserveStart
            preserveStartEnd.name -> preserveStartEnd
            else -> throw IllegalArgumentException()
        }

        fun values(): Array<AxisInterval> = arrayOf(
            preserveEnd,
            preserveStart,
            preserveStartEnd,
        )
    }
}

fun Number.toAxisInterval() = AxisInterval.Number(this)
