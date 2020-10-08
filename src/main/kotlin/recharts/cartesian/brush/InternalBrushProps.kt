package recharts.cartesian.brush

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.NullNumberOrStringProp

external interface InternalBrushProps : RechartsProps{
    var data: Array<Any>?
    var width: Number?
    var x: Number?
    var y: Number?
}

var InternalBrushProps.updateId by NullNumberOrStringProp()
