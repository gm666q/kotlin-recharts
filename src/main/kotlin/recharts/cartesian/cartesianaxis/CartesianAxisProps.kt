package recharts.cartesian.cartesianaxis

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.ViewBox

external interface CartesianAxisProps : RechartsProps {
    //axisLine?: boolean | PresentationAttributes<SVGLineElement>;
    var className: String?
    var height: Number?
    var hide: Boolean?

    //interval?: number | 'preserveStart' | 'preserveEnd' | 'preserveStartEnd';
    var minTickGap: Number?
    var mirror: Boolean?

    //tick?: PresentationAttributes<SVGTextElement> | ReactElement<SVGElement> | ((props: any) => SVGElement) | boolean;
    var tickFormatter: ((value: Any, index: Number) -> String)?

    //tickLine?: boolean | PresentationAttributes<SVGLineElement>;
    var tickMargin: Number?
    var tickSize: Number?
    var ticks: Array<CartesianTickItem>?
    var ticksGenerator: ((props: CartesianAxisProps?) -> Array<CartesianTickItem>)?
    var viewBox: ViewBox?
    var width: Number?
    var x: Number?
    var y: Number?
}

var CartesianAxisProps.orientation by EnumOrNullProp(CartesianAxisOrientation::valueOf)
var CartesianAxisProps.unit by NumberOrStringOrNullProp()
