package recharts.util.types

import org.w3c.dom.svg.SVGLineElement
import recharts.kotlin.Union

sealed class AxisLine(name: String, ordinal: Int) : Union<AxisLine>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : AxisLine("Boolean", 0)
    data class PresentationAttributes(val value: recharts.util.types.PresentationAttributes<SVGLineElement>) :
        AxisLine("PresentationAttributes", 1)

    companion object {
        fun valueOf(value: String): AxisLine {
            throw IllegalArgumentException()
        }

        fun values(): Array<AxisLine> = arrayOf()
    }
}

fun Boolean.toAxisLine() = AxisLine.Boolean(this)
fun PresentationAttributes<SVGLineElement>.toAxisLine() = AxisLine.PresentationAttributes(this)
