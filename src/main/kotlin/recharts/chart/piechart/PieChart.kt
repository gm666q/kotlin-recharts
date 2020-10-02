@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.piechart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("PieChart")
external class PieChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
