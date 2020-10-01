package recharts.util.types

sealed class DataKey<T>(name: kotlin.String, ordinal: Int) : Comparable<DataKey<T>> {
    @JsName("name$")
    private var _name: kotlin.String = name

    @JsName("ordinal$")
    private var _ordinal: Int = ordinal

    val name: kotlin.String
        get() = _name

    val ordinal: Int
        get() = _ordinal

    override fun compareTo(other: DataKey<T>) = ordinal.compareTo(other.ordinal)

    override fun equals(other: Any?) = this === other

    override fun hashCode(): Int = js("Kotlin.identityHashCode")(this)

    override fun toString(): kotlin.String = name

    data class Function<T>(val value: (obj: T) -> Any):DataKey<T>("Function", 0)
    data class Number<T>(val value: kotlin.Number) : DataKey<T>("Number", 1)
    data class String<T>(val value: kotlin.String) : DataKey<T>("String", 2)

    companion object {
        fun <T> valueOf(value: kotlin.String): DataKey<T> {
            throw IllegalArgumentException()
        }

        fun <T> values(): Array<DataKey<T>> {
            return arrayOf()
        }
    }
}
