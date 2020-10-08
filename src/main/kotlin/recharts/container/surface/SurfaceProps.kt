package recharts.container.surface

import react.CSSProperties
import recharts.kotlin.RechartsProps

// TODO
external interface SurfaceProps : RechartsProps {
    //children?: ReactNode
    var className: String?
    var height: Number
    var style: CSSProperties?
    /*viewBox?: {
        x?: number;
        y?: number;
        width?: number;
        height?: number;
    };*/
    var width: Number
}
