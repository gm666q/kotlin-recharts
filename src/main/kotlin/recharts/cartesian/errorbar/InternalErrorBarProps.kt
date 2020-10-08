package recharts.cartesian.errorbar

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp

external interface InternalErrorBarProps : RechartsProps {
    var data: Array<Any>?

    //dataPointFormatter?: (entry: any, dataKey: DataKey<any>) => ErrorBarDataItem;
    var offset: Number?
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}

var InternalErrorBarProps.layout by EnumOrNullProp(ErrorBarLayout::valueOf)
