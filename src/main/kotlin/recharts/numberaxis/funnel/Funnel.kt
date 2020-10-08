@file:JsModule("recharts")
@file:JsNonModule

package recharts.numberaxis.funnel

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Funnel")
external class Funnel : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
