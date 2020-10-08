package recharts.cartesian.area

import recharts.shape.curve.Point as CurvePoint

external interface AreaPointItem: CurvePoint {
    var payload: Any?
    //value?: number | number[];
}
