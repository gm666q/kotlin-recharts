@file:JsModule("recharts")
@file:JsNonModule

package recharts.cartesian.cartesiangrid

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("CartesianGrid")
external class CartesianGrid : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
