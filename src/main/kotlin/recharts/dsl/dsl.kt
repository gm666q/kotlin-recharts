package recharts.dsl

import react.RBuilder
import react.RHandler
import react.child
import recharts.cartesian.cartesiangrid.CartesianGrid
import recharts.cartesian.line.Line
import recharts.cartesian.xaxis.XAxis
import recharts.cartesian.yaxis.YAxis
import recharts.cartesian.zaxis.ZAxis
import recharts.chart.areachart.AreaChart
import recharts.chart.barchart.BarChart
import recharts.chart.composedchart.ComposedChart
import recharts.chart.funnelchart.FunnelChart
import recharts.chart.generatecategoricalchart.CategoricalChartProps
import recharts.chart.linechart.LineChart
import recharts.chart.piechart.PieChart
import recharts.chart.radarchart.RadarChart
import recharts.chart.radialbarchart.RadialBarChart
import recharts.chart.sankey.Sankey
import recharts.chart.scatterchart.ScatterChart
import recharts.chart.treemap.Treemap
import recharts.shape.cross.Cross
import recharts.shape.curve.Curve
import recharts.shape.dot.Dot
import recharts.shape.sector.Sector
import recharts.shape.symbols.Symbols
import recharts.shape.trapezoid.Trapezoid
import recharts.cartesian.cartesiangrid.Props as CartesianGridProps
import recharts.cartesian.line.Props as LineProps
import recharts.cartesian.xaxis.Props as XAxisProps
import recharts.cartesian.yaxis.Props as YAxisProps
import recharts.cartesian.zaxis.Props as ZAxisProps
import recharts.chart.sankey.Props as SankeyProps
import recharts.chart.treemap.Props as TreemapProps
import recharts.shape.cross.Props as CrossProps
import recharts.shape.curve.Props as CurveProps
import recharts.shape.dot.Props as DotProps
import recharts.shape.sector.Props as SectorProps
import recharts.shape.symbols.Props as SymbolsProps
import recharts.shape.trapezoid.Props as TrapezoidProps

fun RBuilder.areaChart(handler: RHandler<CategoricalChartProps>) = child(AreaChart::class) { handler.invoke(this) }
fun RBuilder.barChart(handler: RHandler<CategoricalChartProps>) = child(BarChart::class) { handler.invoke(this) }
fun RBuilder.cartesianGrid(handler: RHandler<CartesianGridProps>) = child(CartesianGrid::class) { handler.invoke(this) }
fun RBuilder.composedChart(handler: RHandler<CategoricalChartProps>) =
    child(ComposedChart::class) { handler.invoke(this) }

fun RBuilder.cross(handler: RHandler<CrossProps>) = child(Cross::class) { handler.invoke(this) }
fun RBuilder.curve(handler: RHandler<CurveProps>) = child(Curve::class) { handler.invoke(this) }
fun RBuilder.dot(handler: RHandler<DotProps>) = child(Dot::class) { handler.invoke(this) }
fun RBuilder.funnelChart(handler: RHandler<CategoricalChartProps>) = child(FunnelChart::class) { handler.invoke(this) }
fun RBuilder.line(handler: RHandler<LineProps>) = child(Line::class) { handler.invoke(this) }
fun RBuilder.lineChart(handler: RHandler<CategoricalChartProps>) = child(LineChart::class) { handler.invoke(this) }
fun RBuilder.pieChart(handler: RHandler<CategoricalChartProps>) = child(PieChart::class) { handler.invoke(this) }
fun RBuilder.radarChart(handler: RHandler<CategoricalChartProps>) = child(RadarChart::class) { handler.invoke(this) }
fun RBuilder.radialBarChart(handler: RHandler<CategoricalChartProps>) =
    child(RadialBarChart::class) { handler.invoke(this) }

fun RBuilder.sankey(handler: RHandler<SankeyProps>) = child(Sankey::class) { handler.invoke(this) }
fun RBuilder.scatterChart(handler: RHandler<CategoricalChartProps>) =
    child(ScatterChart::class) { handler.invoke(this) }

fun RBuilder.sector(handler: RHandler<SectorProps>) = child(Sector::class) { handler.invoke(this) }
fun RBuilder.symbols(handler: RHandler<SymbolsProps>) = child(Symbols::class) { handler.invoke(this) }
fun RBuilder.trapezoid(handler: RHandler<TrapezoidProps>) = child(Trapezoid::class) { handler.invoke(this) }
fun RBuilder.treemap(handler: RHandler<TreemapProps>) = child(Treemap::class) { handler.invoke(this) }
fun RBuilder.xAxis(handler: RHandler<XAxisProps>) = child(XAxis) { handler.invoke(this) }
fun RBuilder.yAxis(handler: RHandler<YAxisProps>) = child(YAxis) { handler.invoke(this) }
fun RBuilder.zAxis(handler: RHandler<ZAxisProps>) = child(ZAxis) { handler.invoke(this) }
