package recharts.util.types

import recharts.kotlin.Union

@Suppress("ClassName")
sealed class AxisDomainItem(name: kotlin.String, ordinal: Int) : Union<AxisDomainItem>(name, ordinal) {
    data class Function(val value: kotlin.Function<*>) : AxisDomainItem("Function", 0)
    data class Number(val value: kotlin.Number) : AxisDomainItem("Number", 1)
    data class String(val value: kotlin.String) : AxisDomainItem("String", 2)
    object auto : AxisDomainItem("auto", 3)
    object dataMax : AxisDomainItem("dataMax", 4)
    object dataMin : AxisDomainItem("dataMin", 5)

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
