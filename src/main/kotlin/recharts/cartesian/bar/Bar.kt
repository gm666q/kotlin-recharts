@file:JsModule("recharts")
@file:JsNonModule

package recharts.cartesian.bar

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Bar")
external class Bar : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
