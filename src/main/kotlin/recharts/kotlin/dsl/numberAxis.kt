package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import recharts.numberaxis.funnel.Funnel
import recharts.numberaxis.funnel.Props as FunnelProps

fun RBuilder.funnel(handler: RHandler<FunnelProps>) = child(Funnel::class) { handler.invoke(this) }
