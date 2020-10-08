@file:JsModule("recharts")
@file:JsNonModule

package recharts.component.text

import react.Component
import react.RState
import react.ReactElement
import recharts.chart.generatecategoricalchart.CategoricalChartProps

@JsName("Text")
external class Text : Component<Props, RState> {
    override fun render(): ReactElement?
}
