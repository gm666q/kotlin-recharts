package recharts.cartesian.cartesianaxis

import recharts.util.types.TickItem

external interface CartesianTickItem : TickItem {
    var isShow: Boolean?
    var tickCoord: Number?
    var tickSize: Number?
}
