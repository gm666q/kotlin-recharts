@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.treemap

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Treemap")
external class Treemap : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
