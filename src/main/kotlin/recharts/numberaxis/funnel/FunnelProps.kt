package recharts.numberaxis.funnel

import recharts.kotlin.properties.*
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

external interface FunnelProps : InternalFunnelProps {
    var animateNewValues: Boolean?
    var animationBegin: Number?
    var animationDuration: Number?
    var className: String?
    var data: Array<Any>?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?
    var onAnimationStart: (() -> Unit)?
    var onAnimationEnd: (() -> Unit)?
}

var FunnelProps.activeIndex by FunnelActiveIndexOrNullProp()
var FunnelProps.activeShape by FunnelActiveShapeProp()
var FunnelProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var FunnelProps.dataKey by DataKeyProp<Any>()
var FunnelProps.legendType by EnumOrNullProp(LegendType::valueOf)
var FunnelProps.nameKey by DataKeyOrNullProp<Any>()
var FunnelProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
