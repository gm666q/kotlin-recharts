package recharts.component.text

import react.CSSProperties
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

external interface TextProps : RechartsProps {
    var angle: Number?
    var scaleToFit: Boolean?
    var style: CSSProperties?
}

var TextProps.lineHeight by NumberOrStringOrNullProp()
var TextProps.textAnchor by EnumOrNullProp(TextTextAnchor::valueOf)
var TextProps.verticalAnchor by EnumOrNullProp(TextVerticalAnchor::valueOf)
