package recharts.cartesian.line

import org.w3c.dom.svg.SVGElement
import react.ReactElement
import recharts.kotlin.Union
import recharts.shape.dot.Props

sealed class LineDot(name: String, ordinal: Int) : Union<LineDot>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : LineDot("Boolean", 0)
    data class DotProps(val value: Props) : LineDot("DotProps", 1)
    data class Function(val value: (props: Any) -> SVGElement) : LineDot("Function", 2)
    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : LineDot("ReactElement", 3)

    companion object {
        fun <T> valueOf(value: String): LineDot {
            throw IllegalArgumentException()
        }

        fun <T> values(): Array<LineDot> {
            return arrayOf()
        }
    }
}

fun Boolean.toLineDot() = LineDot.Boolean(this)
fun Props.toLineDot() = LineDot.DotProps(this)
fun ((props: Any) -> SVGElement).toLineDot() = LineDot.Function(this)
fun ReactElement.toLineDot() = LineDot.ReactElement(this)
