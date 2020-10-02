@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.scatterchart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("ScatterChart")
external class ScatterChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
