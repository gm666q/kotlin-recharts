@file:JsModule("recharts")
@file:JsNonModule

package recharts.shape.curve

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Curve")
external class Curve : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
