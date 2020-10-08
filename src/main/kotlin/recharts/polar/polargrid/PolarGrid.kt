@file:JsModule("recharts")
@file:JsNonModule

package recharts.polar.polargrid

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("PolarGrid")
external class PolarGrid : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
