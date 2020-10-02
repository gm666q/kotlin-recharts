@file:JsModule("recharts")
@file:JsNonModule

package recharts.shape.dot

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Dot")
external class Dot : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
