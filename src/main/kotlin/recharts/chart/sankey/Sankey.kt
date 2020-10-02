@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.sankey

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Sankey")
external class Sankey : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
