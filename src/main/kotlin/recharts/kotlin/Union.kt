package recharts.kotlin

abstract class Union<T : Union<T>>(name: String, ordinal: Int) : Comparable<T> {
    @JsName("name$")
    private var _name: String = name

    @JsName("ordinal$")
    private var _ordinal: Int = ordinal

    val name: String
        get() = _name

    val ordinal: Int
        get() = _ordinal

    override fun compareTo(other: T) = ordinal.compareTo(other.ordinal)

    override fun equals(other: Any?) = this === other

    override fun hashCode(): Int = js("Kotlin.identityHashCode")(this)

    override fun toString() = name

    companion object
}
