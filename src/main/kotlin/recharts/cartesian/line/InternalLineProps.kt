package recharts.cartesian.line

import recharts.kotlin.RechartsProps

// TODO
external interface InternalLineProps : RechartsProps {
    var height: Number?
    var left: Number?
    var points: Array<LinePointItem>?
    var top: Number?
    var width: Number?
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}
