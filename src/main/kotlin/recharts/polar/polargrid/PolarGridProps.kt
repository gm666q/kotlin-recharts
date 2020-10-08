package recharts.polar.polargrid

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp

external interface PolarGridProps : RechartsProps {
    var cx: Number?
    var cy: Number?
    var innerRadius: Number?
    var outerRadius: Number?
    var polarAngles: Array<Number>?
    var polarRadius: Array<Number>?
}

var PolarGridProps.gridType by EnumOrNullProp(PolarGridGridType::valueOf)
