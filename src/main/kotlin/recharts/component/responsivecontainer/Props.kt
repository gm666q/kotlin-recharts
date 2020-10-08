package recharts.component.responsivecontainer

import react.ReactElement
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.NullNumberOrStringProp

external interface Props : RechartsProps {
    var aspect: Number?
    var children: ReactElement
    var debounce: Number?
    var maxHeight: Number?
}

var Props.className by NullNumberOrStringProp()
var Props.height by NullNumberOrStringProp()
var Props.id by NullNumberOrStringProp()
var Props.minHeight by NullNumberOrStringProp()
var Props.minWidth by NullNumberOrStringProp()
var Props.width by NullNumberOrStringProp()
