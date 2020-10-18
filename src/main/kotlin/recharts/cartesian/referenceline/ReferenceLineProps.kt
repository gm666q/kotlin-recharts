package recharts.cartesian.referenceline

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

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

var ReferenceLineProps.className by NumberOrStringOrNullProp()
var ReferenceLineProps.ifOverflow by EnumOrNullProp(ReferenceLineIfOverflow::valueOf)
var ReferenceLineProps.position by EnumOrNullProp(ReferenceLinePosition::valueOf)
var ReferenceLineProps.x by NumberOrStringOrNullProp()
var ReferenceLineProps.xAxisId by NumberOrStringOrNullProp()
var ReferenceLineProps.y by NumberOrStringOrNullProp()
var ReferenceLineProps.yAxisId by NumberOrStringOrNullProp()
