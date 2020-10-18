package recharts.polar.polarangleaxis

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.BaseAxisProps
import recharts.util.types.TickItem

external interface PolarAngleAxisProps : BaseAxisProps {
    var cx: Number?
    var cy: Number?
    var radius: Number?
    var ticks: Array<TickItem>?
}

var PolarAngleAxisProps.angleAxisId by NumberOrStringOrNullProp()
var PolarAngleAxisProps.axisLineType by EnumOrNullProp(PolarAngleAxisAxisLineType::valueOf)
var PolarAngleAxisProps.orientation by EnumOrNullProp(PolarAngleAxisOrientation::valueOf)
