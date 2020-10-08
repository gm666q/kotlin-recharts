package recharts.cartesian.errorbar

import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp

external interface ErrorBarProps : InternalErrorBarProps {
    var width: Number?
}

var ErrorBarProps.dataKey by DataKeyProp<Any>()
var ErrorBarProps.direction by EnumOrNullProp(ErrorBarDirection::valueOf)
