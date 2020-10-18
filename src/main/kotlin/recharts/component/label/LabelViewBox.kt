package recharts.component.label

import recharts.kotlin.Union

sealed class LabelViewBox(name: String, ordinal: Int) : Union<LabelViewBox>(name, ordinal) {
    data class CartesianViewBox(val value: recharts.component.label.CartesianViewBox) :
        LabelViewBox("CartesianViewBox", 0)

    data class PolarViewBox(val value: recharts.component.label.PolarViewBox) : LabelViewBox("PolarViewBox", 1)

    companion object {
        fun valueOf(value: String): LabelViewBox {
            throw IllegalArgumentException()
        }

        fun values(): Array<LabelViewBox> = arrayOf()
    }
}
