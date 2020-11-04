package recharts.numberaxis.funnel

import org.w3c.dom.svg.SVGElement
import react.ReactElement
import recharts.kotlin.Union
import recharts.shape.trapezoid.Props

sealed class FunnelActiveShape(name: String, ordinal: Int) : Union<FunnelActiveShape>(name, ordinal) {
    data class Function(val value: (props: Any) -> SVGElement) : FunnelActiveShape("Function", 0)
    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : FunnelActiveShape("ReactElement", 1)
    data class TrapezoidProps(val value: Props) : FunnelActiveShape("TrapezoidProps", 2)

    companion object {
        fun valueOf(value: String): FunnelActiveShape {
            throw IllegalArgumentException()
        }

        fun values(): Array<FunnelActiveShape> = arrayOf()
    }
}

fun ((props: Any) -> SVGElement).toFunnelActiveShape() = FunnelActiveShape.Function(this)
fun ReactElement.toFunnelActiveShape() = FunnelActiveShape.ReactElement(this)
fun Props.toFunnelActiveShape() = FunnelActiveShape.TrapezoidProps(this)
