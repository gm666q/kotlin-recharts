@file:JsModule("recharts")
@file:JsNonModule

package recharts.shape.polygon

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Polygon")
external class Polygon : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
