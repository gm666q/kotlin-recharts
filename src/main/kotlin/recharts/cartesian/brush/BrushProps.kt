package recharts.cartesian.brush

import react.ReactElement
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.util.types.Padding

// TODO
external interface BrushProps : InternalBrushProps {
    var alwaysShowText: Boolean?
    var children: ReactElement?
    var className: String?
    var endIndex: Number?
    var gap: Number?
    var height: Number
    var leaveTimeOut: Number?
    var onChange: ((newIndex: BrushStartEndIndex) -> Unit)?
    var padding: Padding?
    var startIndex: Number?

    //var tickFormatter: ((value: Any, index: Number) -> ReactText)?
    //traveller?: BrushTravellerType;
    var travellerWidth: Number?
}

var BrushProps.dataKey by DataKeyOrNullProp<Any>()
