package recharts.polar.polarradiusaxis

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp
import recharts.util.types.BaseAxisProps
import recharts.util.types.TickItem

external interface PolarRadiusAxisProps : BaseAxisProps {
    var angle: Number?
    var cx: Number?
    var cy: Number?
    var ticks: Array<TickItem>?
}

var PolarRadiusAxisProps.orientation by EnumOrNullProp(PolarRadiusAxisOrientation::valueOf)
var PolarRadiusAxisProps.radiusAxisId by NullNumberOrStringProp()
