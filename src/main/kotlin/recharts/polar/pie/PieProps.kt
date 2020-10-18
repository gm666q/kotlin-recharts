package recharts.polar.pie

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

external interface PieProps : PieDef, RechartsProps {
    //activeIndex?: number | number[];
    //activeShape?: PieActiveShape;
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var blendStroke: Boolean?
    var className: String?
    var data: Array<Any>?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?

    //label?: Pielabel;
    //labelLine?: PieLabelLine;
    var maxRadius: Number?
    var minAngle: Number?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
    var sectors: Array<PieSectorDataItem>?
}

var PieProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var PieProps.dataKey by DataKeyProp<Any>()
var PieProps.legendType by EnumOrNullProp(LegendType::valueOf)
var PieProps.nameKey by DataKeyOrNullProp<Any>()
var PieProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var PieProps.valueKey by DataKeyOrNullProp<Any>()
