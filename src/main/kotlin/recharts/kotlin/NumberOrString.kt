package recharts.kotlin

sealed class NumberOrString(name: kotlin.String, ordinal: Int) : Union<NumberOrString>(name, ordinal) {
    class Number(val value: kotlin.Number) : NumberOrString("Number", 0)
    class String(val value: kotlin.String) : NumberOrString("String", 1)

    companion object {
        fun valueOf(value: kotlin.String): NumberOrString {
            throw IllegalArgumentException()
        }

        fun values(): Array<NumberOrString> {
            return arrayOf()
        }
    }
}
