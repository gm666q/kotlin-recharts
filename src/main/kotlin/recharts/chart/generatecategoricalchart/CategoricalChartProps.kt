package recharts.chart.generatecategoricalchart

import react.RProps
import recharts.util.types.Margin

external interface CategoricalChartProps : RProps {
    var className: String?
    var compact: Boolean?
    var data: Array<Any>?
    var defaultShowTooltip: Boolean?
    var endAngle: Number?
    var height: Number?
    var id: String?
    var margin: Margin?
    var maxBarSize: Number?
    var onClick: Any?
    var onMouseDown: Any?
    var onMouseEnter: Any?
    var onMouseLeave: Any?
    var onMouseMove: Any?
    var onMouseUp: Any?
    var reverseStackOrder: Boolean?
    var startAngle: Number?
    var style: Any?
    var throttleDelay: Number?
    var width: Number?
}
