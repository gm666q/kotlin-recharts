package recharts.cartesian.referencearea

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

// TODO
external interface ReferenceAreaProps : InternalReferenceAreaProps {
    var alwaysShow: Boolean?
    var isFront: Boolean?
    //shape?: ReactElement<SVGElement> | ((props: any) => SVGElement);
}

var ReferenceAreaProps.className by NumberOrStringOrNullProp()
var ReferenceAreaProps.ifOverflow by EnumOrNullProp(ReferenceAreaIfOverflow::valueOf)
var ReferenceAreaProps.x1 by NumberOrStringOrNullProp()
var ReferenceAreaProps.x2 by NumberOrStringOrNullProp()
var ReferenceAreaProps.xAxisId by NumberOrStringOrNullProp()
var ReferenceAreaProps.y1 by NumberOrStringOrNullProp()
var ReferenceAreaProps.y2 by NumberOrStringOrNullProp()
var ReferenceAreaProps.yAxisId by NumberOrStringOrNullProp()
