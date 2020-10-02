package recharts.shape.curve

import org.w3c.dom.svg.SVGPathElement
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.CurveTypeOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.LayoutType

// TODO
external interface CurveProps : RechartsProps {
    //baseLine?: number | Array<Point>;
    var className: String?
    var connectNulls: Boolean?
    var path: String?
    var pathRef: ((ref: SVGPathElement) -> Unit)?
    var points: Array<Point>?
}

var CurveProps.layout by EnumOrNullProp(LayoutType::valueOf)
var CurveProps.type by CurveTypeOrNullProp()
