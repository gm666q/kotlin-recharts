@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.radarchart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("RadarChart")
external class RadarChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
