@file:JsModule("recharts")
@file:JsNonModule

package recharts.cartesian.line

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Line")
external class Line : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
