package recharts.chart.treemap

import react.ReactElement
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.TreemapNestIndexContentOrNullProp
import recharts.util.types.TreemapNode

// TODO
external interface Props : RechartsProps {
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var aspectRatio: Number?
    var children: Any?
    var className: String?

    //colorPanel?: [];
    var content: ReactElement?
    var data: Array<Any>?
    var fill: String?
    var height: Number?
    var isAnimationActive: Boolean?
    var isUpdateAnimationActive: Boolean?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
    var onClick: ((node: TreemapNode) -> Unit)?
    var onMouseEnter: ((node: TreemapNode, e: Any) -> Unit)?
    var onMouseLeave: ((node: TreemapNode, e: Any) -> Unit)?
    var stroke: String?
    var style: Any?
    var width: Number?
}

var Props.animationEasing by EnumOrNullProp(TreemapAnimationEasing::realValueOf)
var Props.dataKey by DataKeyOrNullProp<Any>()
var Props.nameKey by DataKeyOrNullProp<Any>()
var Props.nestIndexContent by TreemapNestIndexContentOrNullProp()
var Props.type by EnumOrNullProp(TreemapType::valueOf)
