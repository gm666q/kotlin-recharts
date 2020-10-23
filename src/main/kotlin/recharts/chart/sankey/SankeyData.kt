package recharts.chart.sankey

import recharts.util.types.SankeyLink
import recharts.util.types.SankeyNode

external interface SankeyData {
    var links: Array<SankeyLink>
    var node: Array<SankeyNode>
}
