package recharts.cartesian.cartesiangrid

import org.w3c.dom.svg.SVGElement
import org.w3c.dom.svg.SVGLineElement
import recharts.kotlin.Union

sealed class GridLineType(name: String, ordinal: Int) : Union<GridLineType>(name, ordinal) {
    class Boolean(val value: kotlin.Boolean) : GridLineType("Boolean", 0)
    class Function(val value: (props: Any) -> SVGElement) : GridLineType("Function", 1)
    class PresentationAttributes(val value: recharts.util.types.PresentationAttributes<SVGLineElement>) :
        GridLineType("PresentationAttributes", 2)

    class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : GridLineType("ReactElement", 3)

    companion object {
        fun valueOf(value: String): GridLineType {
            throw IllegalArgumentException()
        }

        fun values(): Array<GridLineType> {
            return arrayOf()
        }
    }
}
