package recharts.cartesian.yaxis

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.BaseAxisProps

// TODO
external interface Props : BaseAxisProps {
    var height: Number?

    //interval?: AxisInterval;
    var minTickGap: Number?
    var mirror: Boolean?
    var padding: YAxisPadding
    var reversed: Boolean?

    //ticks?: (string | number)[];
    var width: Number?
}

var Props.orientation by EnumOrNullProp(YAxisOrientation::valueOf)
var Props.yAxisId by NumberOrStringOrNullProp()
