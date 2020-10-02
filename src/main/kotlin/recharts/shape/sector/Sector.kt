@file:JsModule("recharts")
@file:JsNonModule

package recharts.shape.sector

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Sector")
external class Sector : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
