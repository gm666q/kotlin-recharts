package recharts.cartesian.line

import org.w3c.dom.svg.SVGElement
import recharts.kotlin.Union

sealed class LineDot(name: String, ordinal: Int) : Union<LineDot>(name, ordinal) {
    class Boolean(val value: kotlin.Boolean) : LineDot("Boolean", 0)
    class DotProps(val value: recharts.shape.dot.Props) : LineDot("DotProps", 1)
    class Function(val value: (props: Any) -> SVGElement) : LineDot("Function", 2)
    class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : LineDot("ReactElement", 3)

    companion object {
        fun <T> valueOf(value: String): LineDot {
            throw IllegalArgumentException()
        }

        fun <T> values(): Array<LineDot> {
            return arrayOf()
        }
    }
}

/*fun boolean(value: Boolean): LineDot = LineDot.Boolean(value)
fun dotProps(value: DotProps): LineDot = LineDot.DotProps(value)
fun function(value: (props: Any) -> SVGElement): LineDot = LineDot.Function(value)
fun reactElement(value: ReactElement*//*<SVGElement>*//*): LineDot = LineDot.ReactElement(value)*/
