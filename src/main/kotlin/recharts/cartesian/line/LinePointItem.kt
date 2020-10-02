package recharts.cartesian.line

import recharts.shape.curve.Point as CurvePoint

external interface LinePointItem : CurvePoint {
    var payload: Any?
    var value: Number?
}
