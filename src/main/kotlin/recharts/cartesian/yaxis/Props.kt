package recharts.cartesian.yaxis

import recharts.kotlin.properties.AxisIntervalOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberArrayOrStringArrayOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.BaseAxisProps

external interface Props : BaseAxisProps {
    var height: Number?
    var minTickGap: Number?
    var mirror: Boolean?
    var padding: YAxisPadding
    var reversed: Boolean?
    var width: Number?
}

var Props.interval by AxisIntervalOrNullProp()
var Props.orientation by EnumOrNullProp(YAxisOrientation::valueOf)
var Props.ticks by NumberArrayOrStringArrayOrNullProp()
var Props.yAxisId by NumberOrStringOrNullProp()
