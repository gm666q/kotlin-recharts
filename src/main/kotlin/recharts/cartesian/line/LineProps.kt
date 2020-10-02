package recharts.cartesian.line

import recharts.kotlin.properties.*
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

external interface LineProps : InternalLineProps {
    var animateNewValues: Boolean?
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var className: String?
    var connectNulls: Boolean?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
}

var LineProps.activeDot by LineDotOrNullProp()
var LineProps.animationEasing by EnumOrNullProp(AnimationTiming::valueOf)
var LineProps.dataKey by DataKeyOrNullProp<Any>()
var LineProps.dot by LineDotOrNullProp()
var LineProps.layout by EnumOrNullProp(LineLayout::valueOf)
var LineProps.legendType by EnumOrNullProp(LegendType::valueOf)
var LineProps.name by NullNumberOrStringProp()
var LineProps.unit by NullNumberOrStringProp()
var LineProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var LineProps.type by CurveTypeOrNullProp()
var LineProps.xAxisId by NullNumberOrStringProp()
var LineProps.yAxisId by NullNumberOrStringProp()
