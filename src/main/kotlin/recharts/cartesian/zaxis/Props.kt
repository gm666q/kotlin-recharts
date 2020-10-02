package recharts.cartesian.zaxis

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp

// TODO
external interface Props : RechartsProps {
    var range: Array<Number>?
    //scale?: ScaleType | Function;
}

var Props.dataKey by DataKeyOrNullProp<Any>()
var Props.name by NullNumberOrStringProp()
var Props.type by EnumOrNullProp(ZAxisType::valueOf)
var Props.unit by NullNumberOrStringProp()
var Props.zAxisId by NullNumberOrStringProp()
