package recharts.cartesian.zaxis

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.AxisScaleOrNullProp
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

external interface Props : RechartsProps {
    var range: Array<Number>?
}

var Props.dataKey by DataKeyOrNullProp<Any>()
var Props.name by NumberOrStringOrNullProp()
var Props.scale by AxisScaleOrNullProp()
var Props.type by EnumOrNullProp(ZAxisType::valueOf)
var Props.unit by NumberOrStringOrNullProp()
var Props.zAxisId by NumberOrStringOrNullProp()
