package recharts.shape.polygon

import recharts.kotlin.RechartsProps
import recharts.util.types.Coordinate

external interface PolygonProps : RechartsProps {
    var className: String?
    var points: Array<Coordinate>?
}
