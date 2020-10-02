@file:JsModule("recharts")
@file:JsNonModule

package recharts.shape.cross

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Cross")
external class Cross : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
