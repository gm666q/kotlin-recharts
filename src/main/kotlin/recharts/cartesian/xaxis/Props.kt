package recharts.cartesian.xaxis

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.BaseAxisProps

// TODO
external interface Props : BaseAxisProps {
    var height: Number?

    //interval?: AxisInterval;
    var minTickGap: Number?
    var mirror: Boolean?
    var padding: XAxisPadding?
    var reversed: Boolean?

    //ticks?: (string | number)[];
    var width: Number?
}

var Props.orientation by EnumOrNullProp(XAxisOrientation::valueOf)
var Props.xAxisId by NumberOrStringOrNullProp()
