@file:JsModule("recharts")
@file:JsNonModule

package recharts.shape.trapezoid

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Trapezoid")
external class Trapezoid : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
