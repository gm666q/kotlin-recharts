package recharts.cartesian.referenceline

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp

// TODO
external interface ReferenceLineProps : InternalReferenceLineProps {
    var alwaysShow: Boolean?
    var isFront: Boolean?
    /*segment?: Array<{
    x?: number | string;
    y?: number | string;
    }>;*/
    //shape?: ReactElement<SVGElement> | ((props: any) => SVGElement);
}

var ReferenceLineProps.className by NullNumberOrStringProp()
var ReferenceLineProps.ifOverflow by EnumOrNullProp(ReferenceLineIfOverflow::valueOf)
var ReferenceLineProps.position by EnumOrNullProp(ReferenceLinePosition::valueOf)
var ReferenceLineProps.x by NullNumberOrStringProp()
var ReferenceLineProps.xAxisId by NullNumberOrStringProp()
var ReferenceLineProps.y by NullNumberOrStringProp()
var ReferenceLineProps.yAxisId by NullNumberOrStringProp()
