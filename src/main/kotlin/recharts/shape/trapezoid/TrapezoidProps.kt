package recharts.shape.trapezoid

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.AnimationTiming

external interface TrapezoidProps : RechartsProps {
    var animationBegin: Number?
    var animationDuration: Number?
    var className: String?
    var height: Number?
    var isUpdateAnimationActive: Boolean?
    var lowerWidth: Number?
    var upperWidth: Number?
    var x: Number?
    var y: Number?
}

var TrapezoidProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
