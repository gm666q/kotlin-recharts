package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import recharts.polar.pie.Pie
import recharts.polar.polarangleaxis.PolarAngleAxis
import recharts.polar.polargrid.PolarGrid
import recharts.polar.polarradiusaxis.PolarRadiusAxis
import recharts.polar.radar.Radar
import recharts.polar.radialbar.RadialBar
import recharts.polar.pie.Props as PieProps
import recharts.polar.polarangleaxis.Props as PolarAngleAxisProps
import recharts.polar.polargrid.Props as PolarGridProps
import recharts.polar.polarradiusaxis.Props as PolarRadiusAxisProps
import recharts.polar.radar.Props as RadarProps
import recharts.polar.radialbar.Props as RadialBarProps

fun RBuilder.pie(handler: RHandler<PieProps>) = child(Pie::class) { handler.invoke(this) }

fun RBuilder.polarAngleAxis(handler: RHandler<PolarAngleAxisProps>) =
    child(PolarAngleAxis::class) { handler.invoke(this) }

fun RBuilder.polarGrid(handler: RHandler<PolarGridProps>) = child(PolarGrid::class) { handler.invoke(this) }

fun RBuilder.polarRadiusAxis(handler: RHandler<PolarRadiusAxisProps>) =
    child(PolarRadiusAxis::class) { handler.invoke(this) }

fun RBuilder.radar(handler: RHandler<RadarProps>) = child(Radar::class) { handler.invoke(this) }

fun RBuilder.radialBar(handler: RHandler<RadialBarProps>) = child(RadialBar::class) { handler.invoke(this) }
