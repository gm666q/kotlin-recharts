package recharts.shape.curve

import org.w3c.dom.svg.SVGPathElement

external interface CurveProps : CurvePropsBase {
    var pathRef: ((ref: SVGPathElement) -> Unit)?
    var points: Array<Point>?
}
