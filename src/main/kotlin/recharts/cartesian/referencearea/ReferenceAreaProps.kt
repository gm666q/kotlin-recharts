package recharts.cartesian.referencearea

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp

external interface ReferenceAreaProps : InternalReferenceAreaProps {
    var alwaysShow: Boolean?
    var isFront: Boolean?
    //shape?: ReactElement<SVGElement> | ((props: any) => SVGElement);
}

var ReferenceAreaProps.className by NullNumberOrStringProp()
var ReferenceAreaProps.ifOverflow by EnumOrNullProp(ReferenceAreaIfOverflow::valueOf)
var ReferenceAreaProps.x1 by NullNumberOrStringProp()
var ReferenceAreaProps.x2 by NullNumberOrStringProp()
var ReferenceAreaProps.xAxisId by NullNumberOrStringProp()
var ReferenceAreaProps.y1 by NullNumberOrStringProp()
var ReferenceAreaProps.y2 by NullNumberOrStringProp()
var ReferenceAreaProps.yAxisId by NullNumberOrStringProp()
