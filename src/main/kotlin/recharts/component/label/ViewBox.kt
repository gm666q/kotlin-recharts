package recharts.component.label

import recharts.kotlin.Union

sealed class ViewBox(name: String, ordinal: Int) : Union<ViewBox>(name, ordinal) {
    data class CartesianViewBox(val value: recharts.component.label.CartesianViewBox) : ViewBox("CartesianViewBox", 0)
    data class PolarViewBox(val value: recharts.component.label.PolarViewBox) : ViewBox("PolarViewBox", 1)

    companion object {
        fun valueOf(value: String): ViewBox {
            throw IllegalArgumentException()
        }

        fun values(): Array<ViewBox> = arrayOf()
    }
}

fun CartesianViewBox.toLabelViewBox() = ViewBox.CartesianViewBox(this)
fun PolarViewBox.toLabelViewBox() = ViewBox.PolarViewBox(this)
