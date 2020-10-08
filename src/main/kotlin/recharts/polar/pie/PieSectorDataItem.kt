package recharts.polar.pie

import recharts.kotlin.properties.NullNumberOrStringProp
import recharts.util.types.Coordinate
import recharts.shape.sector.Props as SectorProps

external interface PieSectorDataItem : SectorProps {
    var midAngle: Number?
    var middleRadius: Number?
    var paddingAngle: Number?
    var percent: Number?
    var tooltipPosition: Coordinate?
    var value: Number?
}

var PieSectorDataItem.name by NullNumberOrStringProp()
