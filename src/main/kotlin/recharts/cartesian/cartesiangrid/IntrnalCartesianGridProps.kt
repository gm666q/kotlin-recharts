package recharts.cartesian.cartesiangrid

import recharts.kotlin.RechartsProps
import recharts.util.types.ChartOffset

external interface IntrnalCartesianGridProps : RechartsProps {
    var chartHeight: Number?
    var chartWidth: Number?
    var height: Number?
    var horizontalCoordinatesGenerator: ((props: Any) -> Array<Number>)?
    var offset: ChartOffset?
    var verticalCoordinatesGenerator: ((props: Any) -> Array<Number>)?
    var width: Number?
    var x: Number?

    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    var y: Number?
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}
