package recharts.kotlin

sealed class NumberArrayOrStringArray(name: kotlin.String, ordinal: Int) : Union<NumberOrString>(name, ordinal) {
    data class NumberArray(val value: Array<Number>) : NumberArrayOrStringArray("NumberArray", 0) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class.js != other::class.js) return false
            if (!super.equals(other)) return false

            other as NumberArray

            if (!value.contentEquals(other.value)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = super.hashCode()
            result = 31 * result + value.contentHashCode()
            return result
        }
    }

    data class StringArray(val value: Array<String>) : NumberArrayOrStringArray("StringArray", 1) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class.js != other::class.js) return false
            if (!super.equals(other)) return false

            other as StringArray

            if (!value.contentEquals(other.value)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = super.hashCode()
            result = 31 * result + value.contentHashCode()
            return result
        }
    }
}

fun Array<Number>.toNumberArrayOrStringArray() = NumberArrayOrStringArray.NumberArray(this)
fun Array<String>.toNumberArrayOrStringArray() = NumberArrayOrStringArray.StringArray(this)
