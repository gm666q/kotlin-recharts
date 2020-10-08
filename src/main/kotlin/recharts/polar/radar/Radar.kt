@file:JsModule("recharts")
@file:JsNonModule

package recharts.polar.radar

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Radar")
external class Radar : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
