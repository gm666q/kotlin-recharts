package recharts.shape.curve

import recharts.RechartsProps

external interface CurvePropsBase : RechartsProps
/*Omit<PresentationAttributesWithProps<CurveProps, SVGPathElement>, 'type' | 'points'>*/ {
    val baseLine: dynamic //number | Array<Point>
    var className: String?
    var connectNulls: Boolean?
    var path: String?
}
