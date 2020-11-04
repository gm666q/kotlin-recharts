package recharts.util.types

import recharts.kotlin.Union

@Suppress("ClassName")
sealed class AxisDomainItem(name: kotlin.String, ordinal: Int) : Union<AxisDomainItem>(name, ordinal) {
    object auto : AxisDomainItem("auto", 0)
    object dataMax : AxisDomainItem("dataMax", 1)
    object dataMin : AxisDomainItem("dataMin", 2)
    data class Function(val value: kotlin.Function<*>) : AxisDomainItem("Function", 3)
    data class Number(val value: kotlin.Number) : AxisDomainItem("Number", 4)
    data class String(val value: kotlin.String) : AxisDomainItem("String", 5)

    companion object {
        fun valueOf(value: kotlin.String): AxisDomainItem = when (value) {
            auto.name -> auto
            dataMax.name -> dataMax
            dataMin.name -> dataMin
            else -> throw IllegalArgumentException()
        }

        fun values(): Array<AxisDomainItem> = arrayOf(
            auto,
            dataMax,
            dataMin
        )
    }
}

fun Function<*>.toAxisDomainItem() = AxisDomainItem.Function(this)
fun Number.toAxisDomainItem() = AxisDomainItem.Number(this)
fun String.toAxisDomainItem() = AxisDomainItem.String(this)
