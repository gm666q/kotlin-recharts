package recharts.shape.rectangle

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.AnimationTiming

external interface RectangleProps : RechartsProps {
    var animationBegin: Number?
    var animationDuration: Number?
    var className: String?
    var height: Number?

    //radius?: number | RectRadius;
    var isAnimationActive: Boolean?
    var isUpdateAnimationActive: Boolean?
    var width: Number?
    var x: Number?
    var y: Number?
}

var RectangleProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
