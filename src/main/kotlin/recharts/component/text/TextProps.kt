package recharts.component.text

import react.CSSProperties
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NullNumberOrStringProp

external interface TextProps : RechartsProps {
    var angle: Number?
    var scaleToFit: Boolean?
    var style: CSSProperties?
}

var TextProps.lineHeight by NullNumberOrStringProp()
var TextProps.textAnchor by EnumOrNullProp(TextTextAnchor::valueOf)
var TextProps.verticalAnchor by EnumOrNullProp(TextVerticalAnchor::valueOf)
