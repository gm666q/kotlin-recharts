package recharts.cartesian.area

import recharts.kotlin.Union

@Suppress("ClassName")
sealed class AreaBaseValue(name: String, ordinal: Int) : Union<AreaBaseValue>(name, ordinal) {
    object dataMax : AreaBaseValue("dataMax", 0)
    object dataMin : AreaBaseValue("dataMin", 1)
    data class Number(val value: kotlin.Number) : AreaBaseValue("Number", 2)

    companion object {
        fun valueOf(value: String): AreaBaseValue = when (value) {
            dataMax.name -> dataMax
            dataMin.name -> dataMin
            else -> throw IllegalArgumentException()
        }

        fun values(): Array<AreaBaseValue> = arrayOf(
            dataMax,
            dataMin
        )
    }
}

fun Number.toAreaBaseValue() = AreaBaseValue.Number(this)
