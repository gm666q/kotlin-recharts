package recharts.cartesian.referencedot

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.NumberOrStringOrNullProp

external interface InternalReferenceDotProps : RechartsProps {
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}

var InternalReferenceDotProps.clipPathId by NumberOrStringOrNullProp()
