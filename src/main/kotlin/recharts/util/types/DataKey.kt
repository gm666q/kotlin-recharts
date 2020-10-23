package recharts.util.types

import recharts.kotlin.Union

sealed class DataKey<T>(name: kotlin.String, ordinal: Int) : Union<DataKey<T>>(name, ordinal) {
    data class Function<T>(val value: (obj: T) -> Any) : DataKey<T>("Function", 0)
    data class Number<T>(val value: kotlin.Number) : DataKey<T>("Number", 1)
    data class String<T>(val value: kotlin.String) : DataKey<T>("String", 2)

    companion object {
        fun <T> valueOf(value: kotlin.String): DataKey<T> {
            throw IllegalArgumentException()
        }

        fun <T> values(): Array<DataKey<T>> = arrayOf()
    }
}
