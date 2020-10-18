package recharts.component.label

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.LabelContentTypeOrNullProp
import recharts.kotlin.properties.LabelPositionOrNullProp
import recharts.kotlin.properties.LabelViewBoxOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

// TODO
external interface LabelProps : RechartsProps {
    //children?: ReactNode;
    var className: String?
    var formatter: Function<*>? //Function
    var offset: Number?
}

var LabelProps.content by LabelContentTypeOrNullProp()
var LabelProps.position by LabelPositionOrNullProp()
var LabelProps.value by NumberOrStringOrNullProp()
var LabelProps.viewBox by LabelViewBoxOrNullProp()
