package recharts.util.types

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

// TODO
/**
 * The props definition of base axis
 */
external interface BaseAxisProps : RechartsProps {
    /**
     * When domain of the axis is specified and the type of the axis is 'number',
     * if allowDataOverflow is set to be false,
     * the domain will be adjusted when the minimum value of data is smaller than domain[0] or
     * the maximum value of data is greater than domain[1] so that the axis displays all data values.
     * If set to true, graphic elements (line, area, bars) will be clipped to conform to the specified domain.
     */
    var allowDataOverflow: Boolean?

    /**
     * Allow the ticks of axis to be decimals or not.
     */
    var allowDecimals: Boolean?

    /**
     * Allow the axis has duplicated categorys or not when the type of axis is "category".
     */
    var allowDuplicatedCategory: Boolean?

    /**
     * The option for axisLine
     */
    //axisLine?: boolean | PresentationAttributes<SVGLineElement>;
    /**
     * axis react component
     */
    var AxisComp: Any?

    /**
     * The domain of scale in this axis
     */
    //domain?: AxisDomain;
    /**
     * Whether or not display the axis
     */
    var hide: Boolean?

    /**
     * Needed to allow usage of the label prop on the X and Y axis
     */
    //label?: string | number | ReactElement | object ;
    /**
     * The name of data displayed in the axis
     */
    var name: String?
    var range: Array<Number>?
    /**
     * The scale type or functor of scale
     */
    //scale?: ScaleType | Function;
    /**
     * The option for tick
     */
    //tick?: PresentationAttributes<SVGTextElement> | ReactElement<SVGElement> | ((props: any) => SVGElement) | boolean;
    /**
     * The count of ticks
     */
    var tickCount: Number?

    /**
     * The formatter function of tick
     */
    var tickFormatter: ((value: Any, index: Number) -> String)?
    /**
     * The option for tickLine
     */
    //tickLine?: boolean | PresentationAttributes<SVGTextElement>;
    /**
     * The size of tick line
     */
    var tickSize: Number?
}

/**
 * The type of axis
 */
var BaseAxisProps.axisType by EnumOrNullProp(AxisType::valueOf)

/**
 * The key of data displayed in the axis
 */
var BaseAxisProps.dataKey by DataKeyOrNullProp<Any>()

/**
 * The type of axis
 */
var BaseAxisProps.type by EnumOrNullProp(BaseAxisType::valueOf)

/**
 * The unit of data displayed in the axis
 */
var BaseAxisProps.unit by NumberOrStringOrNullProp()
