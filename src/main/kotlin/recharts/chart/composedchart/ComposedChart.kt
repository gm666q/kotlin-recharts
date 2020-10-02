@file:JsModule("recharts")
@file:JsNonModule

package recharts.chart.composedchart

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("ComposedChart")
external class ComposedChart : Component<CategoricalChartProps, RState> {
    override fun render(): ReactElement?
}
