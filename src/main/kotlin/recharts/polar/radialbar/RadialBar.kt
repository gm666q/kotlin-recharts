@file:JsModule("recharts")
@file:JsNonModule

package recharts.polar.radialbar

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("RadialBar")
external class RadialBar : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
