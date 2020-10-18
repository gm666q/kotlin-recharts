package recharts.numberaxis.funnel

import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.shape.trapezoid.TrapezoidProps

external interface FunnelTrapezoidItem : TrapezoidProps {
    var payload: Any?
}

var FunnelTrapezoidItem.value by NumberOrStringOrNullProp()
