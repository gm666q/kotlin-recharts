package recharts.polar.radar

import org.w3c.dom.events.MouseEvent
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface RadarProps : RechartsProps {
    //activeDot?: RadarDot;
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var className: String?

    //dot?: RadarDot;
    var hide: Boolean?
    var isAnimationActive: Boolean?
    var label: Any?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
    var onMouseEnter: ((props: Any, e: MouseEvent/*<SVGPolygonElement>*/) -> Unit)?
    var onMouseLeave: ((props: Any, e: MouseEvent/*<SVGPolygonElement>*/) -> Unit)?
    var points: Array<RadarPoint>?
    //shape?: ReactElement<SVGElement> | ((props: any) => SVGElement);
}

var RadarProps.angleAxisId by NullNumberOrStringProp()
var RadarProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var RadarProps.dataKey by DataKeyProp<Any>()
var RadarProps.legendType by EnumOrNullProp(LegendType::valueOf)
var RadarProps.radiusAxisId by NullNumberOrStringProp()
var RadarProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
