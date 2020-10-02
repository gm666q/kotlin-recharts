package recharts.chart.sankey

import react.ReactElement
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.util.types.Margin

external interface SankeyProps : RechartsProps {
    var children: Any?
    var className: String?
    var data: SankeyData
    var height: Number?
    var iterations: Number?
    var link: ReactElement
    var linkCurvature: Number?
    var margin: Margin?
    var node: ReactElement?
    var nodePadding: Number?
    var nodeWidth: Number?
    var onClick: Any?
    var onMouseEnter: Any?
    var onMouseLeave: Any?
    var style: Any?
    var width: Number?
}

var SankeyProps.dataKey by DataKeyOrNullProp<Any>()
var SankeyProps.nameKey by DataKeyOrNullProp<Any>()
