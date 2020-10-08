@file:JsModule("recharts")
@file:JsNonModule

package recharts.cartesian.brush

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Brush")
external class Brush : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
