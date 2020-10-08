package recharts.cartesian.area

import recharts.kotlin.RechartsProps

external interface InternalAreaProps : RechartsProps {
    //baseLine?: number | Coordinate[];
    var height: Number?
    var left: Number?
    var points: Array<AreaPointItem>?
    var top: Number?
    var width: Number?
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}
