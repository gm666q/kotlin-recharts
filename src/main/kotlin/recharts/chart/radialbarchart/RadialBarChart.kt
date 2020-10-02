@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.radialbarchart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("RadialBarChart")
external class RadialBarChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
