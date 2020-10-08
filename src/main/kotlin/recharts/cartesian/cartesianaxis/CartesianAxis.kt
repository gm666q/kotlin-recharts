@file:JsModule("recharts")
@file:JsNonModule

package recharts.cartesian.cartesianaxis

import react.Component
import react.RState
import react.ReactElement

@JsName("CartesianAxis")
external class CartesianAxis : Component<Props, RState> {
    override fun render(): ReactElement?
}
