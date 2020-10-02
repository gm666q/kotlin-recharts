package recharts.cartesian.cartesiangrid

import recharts.kotlin.properties.GridLineTypeOrNullProp

external interface CartesianGridProps : IntrnalCartesianGridProps {
    var horizontalFill: Array<String>?
    var horizontalPoints: Array<Number>?
    var verticalFill: Array<String>?
    var verticalPoints: Array<Number>?
}

var CartesianGridProps.horizontal by GridLineTypeOrNullProp()
var CartesianGridProps.vertical by GridLineTypeOrNullProp()
