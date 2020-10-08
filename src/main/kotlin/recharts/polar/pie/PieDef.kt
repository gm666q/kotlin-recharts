package recharts.polar.pie

import recharts.kotlin.properties.NullNumberOrStringProp

external interface PieDef {
    var endAngle: Number?
    var paddingAngle: Number?
    var startAngle: Number?
}

var PieDef.cornerRadius by NullNumberOrStringProp()
var PieDef.cx by NullNumberOrStringProp()
var PieDef.cy by NullNumberOrStringProp()
var PieDef.innerRadius by NullNumberOrStringProp()
var PieDef.outerRadius by NullNumberOrStringProp()
