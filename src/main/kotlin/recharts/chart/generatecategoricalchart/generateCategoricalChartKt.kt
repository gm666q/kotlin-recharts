package recharts.chart.generatecategoricalchart

import recharts.EnumOrNullProp
import recharts.NullNumberOrStringProp
import recharts.util.types.LayoutType

var CategoricalChartProps.barCategoryGap by NullNumberOrStringProp()
var CategoricalChartProps.barGap by NullNumberOrStringProp()
var CategoricalChartProps.barSize by NullNumberOrStringProp()
var CategoricalChartProps.cx by NullNumberOrStringProp()
var CategoricalChartProps.cy by NullNumberOrStringProp()
var CategoricalChartProps.innerRadius by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.layout by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.outerRadius by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.stackOffset by EnumOrNullProp(CategoricalChartStackOffset::valueOf)
var CategoricalChartProps.syncId by NullNumberOrStringProp()
