package recharts.chart.generatecategoricalchart

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.LayoutType
import recharts.util.types.Margin

external interface CategoricalChartProps : RechartsProps {
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

var CategoricalChartProps.barCategoryGap by NumberOrStringOrNullProp()
var CategoricalChartProps.barGap by NumberOrStringOrNullProp()
var CategoricalChartProps.barSize by NumberOrStringOrNullProp()
var CategoricalChartProps.cx by NumberOrStringOrNullProp()
var CategoricalChartProps.cy by NumberOrStringOrNullProp()
var CategoricalChartProps.innerRadius by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.layout by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.outerRadius by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.stackOffset by EnumOrNullProp(CategoricalChartStackOffset::valueOf)
var CategoricalChartProps.syncId by NumberOrStringOrNullProp()
