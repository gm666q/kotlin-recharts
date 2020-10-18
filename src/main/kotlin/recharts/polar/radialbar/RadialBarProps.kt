package recharts.polar.radialbar

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface RadialBarProps : RechartsProps {
    var activeIndex: Number?

    //activeShape?: RadialBarShape;
    var animationBegin: Number?
    var animationDuration: Number?

    //background?: RadialBarBackground
    var className: String?
    var cornerIsExternal: Boolean?
    var data: Array<RadialBarDataItem>?
    var endAngle: Number?
    var forceCornerRadius: Boolean?
    var hide: Boolean?
    var isAnimationActive: Boolean?
    var label: Any?
    var maxBarSize: Number?
    var minPointSize: Number?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?

    //shape?: RadialBarShape;
    var startAngle: Number?
}

var RadialBarProps.angleAxisId by NullNumberOrStringProp()
var RadialBarProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var RadialBarProps.animationId by NullNumberOrStringProp()
var RadialBarProps.cornerRadius by NullNumberOrStringProp()
var RadialBarProps.dataKey by DataKeyProp<Any>()
var RadialBarProps.legendType by EnumOrNullProp(LegendType::valueOf)
var RadialBarProps.radiusAxisId by NullNumberOrStringProp()
var RadialBarProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
