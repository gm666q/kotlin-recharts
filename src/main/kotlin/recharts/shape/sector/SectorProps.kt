package recharts.shape.sector

import recharts.kotlin.RechartsProps
import recharts.util.types.GeometrySector

external interface SectorProps : GeometrySector, RechartsProps {
    var className: String?
}
