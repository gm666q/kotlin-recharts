@file:JsModule("recharts")
@file:JsNonModule

package recharts.component.responsivecontainer

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("ResponsiveContainer")
external class ResponsiveContainer : Component<Props, RState> {
    override fun render(): ReactElement?
}
