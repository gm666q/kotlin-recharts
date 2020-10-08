package recharts.cartesian.bar

import recharts.kotlin.RechartsProps

// TODO
external interface InternalBarProps : RechartsProps {
    var data: Array<BarRectangleItem>?
    var left: Number?
    var top: Number?
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number>; x?: number; width?: number };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number>; y?: number; height?: number };
}
