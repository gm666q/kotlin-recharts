package recharts.numberaxis.funnel

import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface FunnelProps : InternalFunnelProps {
    //activeIndex?: number | number[];
    //activeShape: ReactElement<SVGElement> | ((props: any) => SVGElement) | TrapezoidProps;
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

var FunnelProps.animationEasing by EnumOrNullProp(AnimationTiming::valueOf)
var FunnelProps.dataKey by DataKeyProp<Any>()
var FunnelProps.legendType by EnumOrNullProp(LegendType::valueOf)
var FunnelProps.nameKey by DataKeyOrNullProp<Any>()
var FunnelProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
