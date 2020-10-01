package recharts.shape.curve

import recharts.EnumOrNullProp
import recharts.util.types.LayoutType

fun CurvePropsBase.baseLine(v: Number) {
    asDynamic()["baseLine"] = v
}

fun CurvePropsBase.baseLine(v: Array<Point>?) {
    asDynamic()["baseLine"] = v
}

var CurvePropsBase.layout by EnumOrNullProp(LayoutType::valueOf)
var CurvePropsBase.type by CurveTypeProp()
