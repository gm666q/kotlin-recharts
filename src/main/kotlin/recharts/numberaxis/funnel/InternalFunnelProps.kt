package recharts.numberaxis.funnel

import recharts.kotlin.RechartsProps

external interface InternalFunnelProps : RechartsProps {
    var animationId: Number?
    var trapezoids: Array<FunnelTrapezoidItem>?
}
