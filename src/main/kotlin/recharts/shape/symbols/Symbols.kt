@file:JsModule("recharts")
@file:JsNonModule

package recharts.shape.symbols

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Symbols")
external class Symbols : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
