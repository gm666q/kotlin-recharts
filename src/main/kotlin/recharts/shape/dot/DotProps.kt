package recharts.shape.dot

import recharts.RechartsProps

external interface DotProps : RechartsProps /*PresentationAttributesWithProps<DotProps, SVGCircleElement> & DotProps*/ {
    var className: String?
    var cx: Number?
    var cy: Number?
    var r: Number?
}