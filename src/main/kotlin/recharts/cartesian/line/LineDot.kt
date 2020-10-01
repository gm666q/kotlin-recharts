package recharts.cartesian.line

import org.w3c.dom.svg.SVGElement

sealed class LineDot(name: String, ordinal: Int) : Comparable<LineDot> {
    @JsName("name$")
    private var _name: String = name

    @JsName("ordinal$")
    private var _ordinal: Int = ordinal

    val name: String
        get() = _name

    val ordinal: Int
        get() = _ordinal

    override fun compareTo(other: LineDot) = ordinal.compareTo(other.ordinal)

    override fun equals(other: Any?) = this === other

    override fun hashCode(): Int = js("Kotlin.identityHashCode")(this)

    override fun toString(): String = name

    data class Boolean(val value: kotlin.Boolean) : LineDot("Boolean", 0)
    data class DotProps(val value: recharts.shape.dot.DotProps) : LineDot("DotProps", 1)
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

/*fun boolean(value: Boolean): LineDot = LineDot.Boolean(value)
fun dotProps(value: DotProps): LineDot = LineDot.DotProps(value)
fun function(value: (props: Any) -> SVGElement): LineDot = LineDot.Function(value)
fun reactElement(value: ReactElement*//*<SVGElement>*//*): LineDot = LineDot.ReactElement(value)*/
