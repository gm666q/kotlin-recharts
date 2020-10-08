package recharts.cartesian.bar

import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface BarProps : InternalBarProps {
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    //background?: RectangleShapeType;
    var barSize: Number?
    var className: String?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?
    var maxBarSize: Number?
    var minPointSize: Number?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
    //shape?: ReactElement<SVGElement> | ((props: any) => SVGElement);
}

var BarProps.animationEasing by EnumOrNullProp(AnimationTiming::valueOf)
var BarProps.dataKey by DataKeyProp<Any>()
var BarProps.layout by EnumOrNullProp(BarLayout::valueOf)
var BarProps.legendType by EnumOrNullProp(LegendType::valueOf)
var BarProps.name by NullNumberOrStringProp()
var BarProps.stackId by NullNumberOrStringProp()
var BarProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var BarProps.unit by NullNumberOrStringProp()
var BarProps.xAxisId by NullNumberOrStringProp()
var BarProps.yAxisId by NullNumberOrStringProp()
