package recharts

sealed class NumberOrString(name: kotlin.String, ordinal: Int) : Comparable<NumberOrString> {
    @JsName("name$")
    private var _name: kotlin.String = name

    @JsName("ordinal$")
    private var _ordinal: Int = ordinal

    val name: kotlin.String
        get() = _name

    val ordinal: Int
        get() = _ordinal

    override fun compareTo(other: NumberOrString) = ordinal.compareTo(other.ordinal)

    override fun equals(other: Any?) = this === other

    override fun hashCode(): Int = js("Kotlin.identityHashCode")(this)

    override fun toString(): kotlin.String = name

    data class Number(val value: kotlin.Number) : NumberOrString("Number", 0)
    data class String(val value: kotlin.String) : NumberOrString("String", 1)

    companion object {
        fun valueOf(value: kotlin.String): NumberOrString {
            throw IllegalArgumentException()
        }

        fun values(): Array<NumberOrString> {
            return arrayOf()
        }
    }
}