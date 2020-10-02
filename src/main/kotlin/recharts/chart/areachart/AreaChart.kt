@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.areachart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("AreaChart")
external class AreaChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
