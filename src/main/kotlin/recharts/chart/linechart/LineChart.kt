@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.linechart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("LineChart")
external class LineChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
