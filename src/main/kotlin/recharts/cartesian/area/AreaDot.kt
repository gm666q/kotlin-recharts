package recharts.cartesian.area

import org.w3c.dom.svg.SVGElement
import react.ReactElement
import recharts.kotlin.Union
import recharts.shape.dot.Props
import recharts.util.types.DataKey

sealed class AreaDot(name: String, ordinal: Int) : Union<AreaDot>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : AreaDot("Boolean", 0)
    data class DotProps(val value: Props) : AreaDot("DotProps", 1)
    data class ReactElement(val value: react.ReactElement) : AreaDot("ReactElement", 2)
    data class ReactElementFunction(val value: (props: Any) -> react.ReactElement) : AreaDot("ReactElementFunction", 3)
    data class SVGElementFunction(val value: (props: Any) -> SVGElement) : AreaDot("SVGElementFunction", 4)

    companion object {
        fun <T> valueOf(value: kotlin.String): DataKey<T> {
            throw IllegalArgumentException()
        }

        fun <T> values(): Array<DataKey<T>> = arrayOf()
    }
}

fun Boolean.toAreaDot() = AreaDot.Boolean(this)
fun Props.toAreaDot() = AreaDot.DotProps(this)
fun ReactElement.toAreaDot() = AreaDot.ReactElement(this)
fun ((props: Any) -> ReactElement).toAreaDot() = AreaDot.ReactElementFunction(this)
fun ((props: Any) -> SVGElement).toAreaDot() = AreaDot.SVGElementFunction(this)
