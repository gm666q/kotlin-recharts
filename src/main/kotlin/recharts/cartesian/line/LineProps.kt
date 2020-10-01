package recharts.cartesian.line

import recharts.shape.curve.CurvePropsBase

external interface LineProps : CurvePropsBase {
    var animateNewValues: Boolean?
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    override var className: String?
    override var connectNulls: Boolean?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
}
