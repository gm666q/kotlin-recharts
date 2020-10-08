@file:JsModule("recharts")
@file:JsNonModule

package recharts.cartesian.scatter

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Scatter")
external class Scatter : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
