package recharts.polar.radialbar

import recharts.shape.sector.SectorProps

external interface RadialBarDataItem : SectorProps {
    var background: SectorProps?
    var payload: Any?
    var value: Any?
}
