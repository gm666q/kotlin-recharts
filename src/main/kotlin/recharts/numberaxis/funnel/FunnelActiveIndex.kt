package recharts.numberaxis.funnel

import recharts.kotlin.Union

sealed class FunnelActiveIndex(name: String, ordinal: Int) : Union<FunnelActiveIndex>(name, ordinal) {
    data class Number(val value: kotlin.Number) : FunnelActiveIndex("Number", 0)
    data class NumberArray(val value: Array<kotlin.Number>) : FunnelActiveIndex("NumberArray", 1) {
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

    companion object {
        fun valueOf(value: String): FunnelActiveIndex {
            throw IllegalArgumentException()
        }

        fun values(): Array<FunnelActiveIndex> = arrayOf()
    }
}
