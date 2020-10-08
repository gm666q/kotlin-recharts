package recharts.cartesian.referencedot

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp

// TODO
external interface ReferenceDotProps : InternalReferenceDotProps {
    var alwaysShow: Boolean?
    var isFront: Boolean?
    var r: Number?
    //shape?: ReactElement<SVGElement> | ((props: any) => SVGElement);
}

var ReferenceDotProps.className by NullNumberOrStringProp()
var ReferenceDotProps.ifOverflow by EnumOrNullProp(ReferenceDotIfOverflow::valueOf)
var ReferenceDotProps.x by NullNumberOrStringProp()
var ReferenceDotProps.xAxisId by NullNumberOrStringProp()
var ReferenceDotProps.y by NullNumberOrStringProp()
var ReferenceDotProps.yAxisId by NullNumberOrStringProp()
