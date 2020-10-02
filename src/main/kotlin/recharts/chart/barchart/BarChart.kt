@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.barchart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("BarChart")
external class BarChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
