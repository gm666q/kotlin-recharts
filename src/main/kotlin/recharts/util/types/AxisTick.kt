package recharts.util.types

import org.w3c.dom.svg.SVGElement
import org.w3c.dom.svg.SVGTextElement
import recharts.kotlin.Union

sealed class AxisTick(name: String, ordinal: Int) : Union<AxisTick>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : AxisTick("Boolean", 0)
    data class Function(val value: (props: Any) -> SVGElement) : AxisTick("Function", 1)
    data class PresentationAttributes(val value: recharts.util.types.PresentationAttributes<SVGTextElement>) :
        AxisTick("PresentationAttributes", 2)

    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : AxisTick("ReactElement", 3)

    companion object {
        fun valueOf(value: String): AxisLine {
            throw IllegalArgumentException()
        }

        fun values(): Array<AxisLine> = arrayOf()
    }
}
