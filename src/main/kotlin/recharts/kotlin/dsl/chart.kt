package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
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
import recharts.chart.sankey.Props as SankeyProps
import recharts.chart.treemap.Props as TreemapProps

fun RBuilder.areaChart(handler: RHandler<CategoricalChartProps>) = child(AreaChart::class) { handler.invoke(this) }

fun RBuilder.barChart(handler: RHandler<CategoricalChartProps>) = child(BarChart::class) { handler.invoke(this) }

fun RBuilder.composedChart(handler: RHandler<CategoricalChartProps>) =
    child(ComposedChart::class) { handler.invoke(this) }

fun RBuilder.funnelChart(handler: RHandler<CategoricalChartProps>) = child(FunnelChart::class) { handler.invoke(this) }

fun RBuilder.lineChart(handler: RHandler<CategoricalChartProps>) = child(LineChart::class) { handler.invoke(this) }

fun RBuilder.pieChart(handler: RHandler<CategoricalChartProps>) = child(PieChart::class) { handler.invoke(this) }

fun RBuilder.radarChart(handler: RHandler<CategoricalChartProps>) = child(RadarChart::class) { handler.invoke(this) }

fun RBuilder.radialBarChart(handler: RHandler<CategoricalChartProps>) =
    child(RadialBarChart::class) { handler.invoke(this) }

fun RBuilder.sankey(handler: RHandler<SankeyProps>) = child(Sankey::class) { handler.invoke(this) }

fun RBuilder.scatterChart(handler: RHandler<CategoricalChartProps>) =
    child(ScatterChart::class) { handler.invoke(this) }

fun RBuilder.treemap(handler: RHandler<TreemapProps>) = child(Treemap::class) { handler.invoke(this) }
