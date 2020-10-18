package recharts.polar.pie

import recharts.kotlin.properties.NumberOrStringOrNullProp

external interface PieDef {
    var endAngle: Number?
    var paddingAngle: Number?
    var startAngle: Number?
}

var PieDef.cornerRadius by NumberOrStringOrNullProp()
var PieDef.cx by NumberOrStringOrNullProp()
var PieDef.cy by NumberOrStringOrNullProp()
var PieDef.innerRadius by NumberOrStringOrNullProp()
var PieDef.outerRadius by NumberOrStringOrNullProp()
