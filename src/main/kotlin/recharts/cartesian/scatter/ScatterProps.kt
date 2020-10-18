package recharts.cartesian.scatter

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.CurveTypeOrNullProp
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface ScatterProps : RechartsProps {
    var activeIndex: Number?

    //activeShape?: ReactElement<SVGElement> | ((props: any) => SVGElement) | SymbolsProps;
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var className: String
    var data: Array<Any>?
    var hide: Boolean?
    var isAnimationActive: Boolean?
    var left: Number?

    //line?: ReactElement<SVGElement> | ((props: any) => SVGElement) | CurveProps | boolean;
    var points: Array<ScatterPointItem>?

    //shape?: SymbolType | ReactElement<SVGElement> | ((props: any) => SVGElement);
    var top: Number?
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //zAxis?: Omit<ZAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}

var ScatterProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var ScatterProps.dataKey by DataKeyOrNullProp<Any>()
var ScatterProps.legendType by EnumOrNullProp(LegendType::valueOf)
var ScatterProps.lineJointType by CurveTypeOrNullProp()
var ScatterProps.lineType by EnumOrNullProp(ScatterLineType::valueOf)
var ScatterProps.name by NullNumberOrStringProp()
var ScatterProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var ScatterProps.xAxisId by NullNumberOrStringProp()
var ScatterProps.yAxisId by NullNumberOrStringProp()
var ScatterProps.zAxisId by NullNumberOrStringProp()
