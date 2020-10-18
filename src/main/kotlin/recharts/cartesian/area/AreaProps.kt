package recharts.cartesian.area

import recharts.kotlin.properties.CurveTypeOrNullProp
import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface AreaProps : InternalAreaProps {
    //activeDot?: AreaDot;
    var animateNewValues: Boolean?
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?

    //baseValue?: number | 'dataMin' | 'dataMax';
    var className: String?
    var connectNulls: Boolean?

    //dot?: AreaDot;
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?
    var isRange: Boolean?
    var label: Any?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
}

var AreaProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var AreaProps.dataKey by DataKeyProp<Any>()
var AreaProps.layout by EnumOrNullProp(AreaLayout::valueOf)
var AreaProps.legendType by EnumOrNullProp(LegendType::valueOf)
var AreaProps.name by NumberOrStringOrNullProp()
var AreaProps.stackId by NumberOrStringOrNullProp()
var AreaProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var AreaProps.type by CurveTypeOrNullProp()
var AreaProps.unit by NumberOrStringOrNullProp()
var AreaProps.xAxisId by NumberOrStringOrNullProp()
var AreaProps.yAxisId by NumberOrStringOrNullProp()
