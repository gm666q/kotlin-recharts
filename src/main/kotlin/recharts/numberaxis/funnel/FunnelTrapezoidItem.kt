package recharts.numberaxis.funnel

import recharts.kotlin.properties.NullNumberOrStringProp
import recharts.shape.trapezoid.TrapezoidProps

external interface FunnelTrapezoidItem : TrapezoidProps {
    var payload: Any?
}

var FunnelTrapezoidItem.value by NullNumberOrStringProp()
