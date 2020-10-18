package recharts.component.responsivecontainer

import react.ReactElement
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.NumberOrStringOrNullProp

external interface Props : RechartsProps {
    var aspect: Number?
    var children: ReactElement
    var debounce: Number?
    var maxHeight: Number?
}

var Props.className by NumberOrStringOrNullProp()
var Props.height by NumberOrStringOrNullProp()
var Props.id by NumberOrStringOrNullProp()
var Props.minHeight by NumberOrStringOrNullProp()
var Props.minWidth by NumberOrStringOrNullProp()
var Props.width by NumberOrStringOrNullProp()
