package recharts.cartesian.xaxis

import recharts.kotlin.properties.AxisIntervalOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberArrayOrStringArrayOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.BaseAxisProps

external interface Props : BaseAxisProps {
    var height: Number?
    var minTickGap: Number?
    var mirror: Boolean?
    var padding: XAxisPadding?
    var reversed: Boolean?
    var width: Number?
}

var Props.interval by AxisIntervalOrNullProp()
var Props.orientation by EnumOrNullProp(XAxisOrientation::valueOf)
var Props.ticks by NumberArrayOrStringArrayOrNullProp()
var Props.xAxisId by NumberOrStringOrNullProp()
