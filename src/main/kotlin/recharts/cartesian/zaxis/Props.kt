package recharts.cartesian.zaxis

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

// TODO
external interface Props : RechartsProps {
    var range: Array<Number>?
    //scale?: ScaleType | Function;
}

var Props.dataKey by DataKeyOrNullProp<Any>()
var Props.name by NumberOrStringOrNullProp()
var Props.type by EnumOrNullProp(ZAxisType::valueOf)
var Props.unit by NumberOrStringOrNullProp()
var Props.zAxisId by NumberOrStringOrNullProp()
