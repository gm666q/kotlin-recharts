@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.funnelchart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("FunnelChart")
external class FunnelChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
