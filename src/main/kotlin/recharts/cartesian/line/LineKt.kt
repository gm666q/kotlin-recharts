package recharts.cartesian.line

import recharts.EnumOrNullProp
import recharts.NullNumberOrStringProp
import recharts.util.types.AnimationTiming
import recharts.util.types.DataKeyOrNullProp
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

var LineProps.activeDot by LineDotOrNullProp()
var LineProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var LineProps.dataKey by DataKeyOrNullProp<Any>()
var LineProps.dot by LineDotOrNullProp()
var LineProps.layout by EnumOrNullProp(LineLayout::valueOf)
var LineProps.legendType by EnumOrNullProp(LegendType::valueOf)
var LineProps.name by NullNumberOrStringProp()
var LineProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var LineProps.unit by NullNumberOrStringProp()
var LineProps.xAxisId by NullNumberOrStringProp()
var LineProps.yAxisId by NullNumberOrStringProp()
