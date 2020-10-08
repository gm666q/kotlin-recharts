package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import react.child
import recharts.cartesian.area.Area
import recharts.cartesian.bar.Bar
import recharts.cartesian.brush.Brush
import recharts.cartesian.cartesianaxis.CartesianAxis
import recharts.cartesian.cartesiangrid.CartesianGrid
import recharts.cartesian.errorbar.ErrorBar
import recharts.cartesian.line.Line
import recharts.cartesian.referencearea.ReferenceArea
import recharts.cartesian.referencedot.ReferenceDot
import recharts.cartesian.referenceline.ReferenceLine
import recharts.cartesian.scatter.Scatter
import recharts.cartesian.xaxis.XAxis
import recharts.cartesian.yaxis.YAxis
import recharts.cartesian.zaxis.ZAxis
import recharts.cartesian.area.Props as AreaProps
import recharts.cartesian.bar.Props as BarProps
import recharts.cartesian.brush.Props as BrushProps
import recharts.cartesian.cartesianaxis.Props as CartesianAxisProps
import recharts.cartesian.cartesiangrid.Props as CartesianGridProps
import recharts.cartesian.errorbar.Props as ErrorBarProps
import recharts.cartesian.line.Props as LineProps
import recharts.cartesian.referencearea.Props as ReferenceAreaProps
import recharts.cartesian.referencedot.Props as ReferenceDotProps
import recharts.cartesian.referenceline.Props as ReferenceLineProps
import recharts.cartesian.scatter.Props as ScatterProps
import recharts.cartesian.xaxis.Props as XAxisProps
import recharts.cartesian.yaxis.Props as YAxisProps
import recharts.cartesian.zaxis.Props as ZAxisProps

fun RBuilder.area(handler: RHandler<AreaProps>) = child(Area::class) { handler.invoke(this) }

fun RBuilder.bar(handler: RHandler<BarProps>) = child(Bar::class) { handler.invoke(this) }

fun RBuilder.brush(handler: RHandler<BrushProps>) = child(Brush::class) { handler.invoke(this) }

fun RBuilder.cartesianAxis(handler: RHandler<CartesianAxisProps>) = child(CartesianAxis::class) { handler.invoke(this) }

fun RBuilder.cartesianGrid(handler: RHandler<CartesianGridProps>) = child(CartesianGrid::class) { handler.invoke(this) }

fun RBuilder.errorBar(handler: RHandler<ErrorBarProps>) = child(ErrorBar) { handler.invoke(this) }

fun RBuilder.line(handler: RHandler<LineProps>) = child(Line::class) { handler.invoke(this) }

fun RBuilder.referenceArea(handler: RHandler<ReferenceAreaProps>) = child(ReferenceArea) { handler.invoke(this) }

fun RBuilder.referenceDot(handler: RHandler<ReferenceDotProps>) = child(ReferenceDot) { handler.invoke(this) }

fun RBuilder.referenceLine(handler: RHandler<ReferenceLineProps>) = child(ReferenceLine) { handler.invoke(this) }

fun RBuilder.scatter(handler: RHandler<ScatterProps>) = child(Scatter::class) { handler.invoke(this) }

fun RBuilder.xAxis(handler: RHandler<XAxisProps>) = child(XAxis) { handler.invoke(this) }

fun RBuilder.yAxis(handler: RHandler<YAxisProps>) = child(YAxis) { handler.invoke(this) }

fun RBuilder.zAxis(handler: RHandler<ZAxisProps>) = child(ZAxis) { handler.invoke(this) }
