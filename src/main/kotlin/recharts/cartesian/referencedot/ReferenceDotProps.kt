package recharts.cartesian.referencedot

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

// TODO
external interface ReferenceDotProps : InternalReferenceDotProps {
    var alwaysShow: Boolean?
    var isFront: Boolean?
    var r: Number?
    //shape?: ReactElement<SVGElement> | ((props: any) => SVGElement);
}

var ReferenceDotProps.className by NumberOrStringOrNullProp()
var ReferenceDotProps.ifOverflow by EnumOrNullProp(ReferenceDotIfOverflow::valueOf)
var ReferenceDotProps.x by NumberOrStringOrNullProp()
var ReferenceDotProps.xAxisId by NumberOrStringOrNullProp()
var ReferenceDotProps.y by NumberOrStringOrNullProp()
var ReferenceDotProps.yAxisId by NumberOrStringOrNullProp()
