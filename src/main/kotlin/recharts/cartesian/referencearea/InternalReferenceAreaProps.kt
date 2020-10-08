package recharts.cartesian.referencearea

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.NullNumberOrStringProp
import recharts.util.types.ViewBox

external interface InternalReferenceAreaProps :RechartsProps{
    var viewBox: ViewBox?
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}

var InternalReferenceAreaProps.clipPathId by NullNumberOrStringProp()
