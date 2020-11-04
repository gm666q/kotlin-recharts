package recharts.cartesian.cartesiangrid

import org.w3c.dom.svg.SVGElement
import org.w3c.dom.svg.SVGLineElement
import react.ReactElement
import recharts.kotlin.Union
import recharts.util.types.PresentationAttributes

sealed class GridLineType(name: String, ordinal: Int) : Union<GridLineType>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : GridLineType("Boolean", 0)
    data class Function(val value: (props: Any) -> SVGElement) : GridLineType("Function", 1)
    data class PresentationAttributes(val value: recharts.util.types.PresentationAttributes<SVGLineElement>) :
        GridLineType("PresentationAttributes", 2)

    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : GridLineType("ReactElement", 3)

    companion object {
        fun valueOf(value: String): GridLineType {
            throw IllegalArgumentException()
        }

        fun values(): Array<GridLineType> {
            return arrayOf()
        }
    }
}

fun Boolean.toGridLineType() = GridLineType.Boolean(this)
fun ((props: Any) -> SVGElement).toGridLineType() = GridLineType.Function(this)
fun PresentationAttributes<SVGLineElement>.toGridLineType() = GridLineType.PresentationAttributes(this)
fun ReactElement.toGridLineType() = GridLineType.ReactElement(this)
