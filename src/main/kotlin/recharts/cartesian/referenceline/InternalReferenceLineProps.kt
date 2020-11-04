package recharts.cartesian.referenceline

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.ViewBox

// TODO
external interface InternalReferenceLineProps : RechartsProps {
    var viewBox: ViewBox?
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}

var InternalReferenceLineProps.clipPathId by NumberOrStringOrNullProp()
