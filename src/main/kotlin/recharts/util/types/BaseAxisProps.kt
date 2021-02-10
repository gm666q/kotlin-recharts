/*
 * Copyright 2020-2021 Jan Śmiałkowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package recharts.util.types

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.*

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
     * axis react component
     */
    var AxisComp: Any?

    /**
     * Whether or not display the axis
     */
    var hide: Boolean?

    /**
     * The name of data displayed in the axis
     */
    var name: String?

    var range: Array<Number>?

    /**
     * The count of ticks
     */
    var tickCount: Number?

    /**
     * The formatter function of tick
     */
    var tickFormatter: ((value: Any, index: Number) -> String)?

    /**
     * The size of tick line
     */
    var tickSize: Number?
}

/**
 * The option for axisLine
 */
var BaseAxisProps.axisLine by AxisLineOrNullProp()

/**
 * The type of axis
 */
var BaseAxisProps.axisType by EnumOrNullProp(AxisType::valueOf)

/**
 * The key of data displayed in the axis
 */
var BaseAxisProps.dataKey by DataKeyOrNullProp<Any>()

/**
 * The domain of scale in this axis
 */
var BaseAxisProps.domain by AxisDomainOrNullProp()

/**
 * Needed to allow usage of the label prop on the X and Y axis
 */
var BaseAxisProps.label by AxisLabelOrNullProp()

/**
 * The scale type or functor of scale
 */
var BaseAxisProps.scale by AxisScaleOrNullProp()

/**
 * The option for tick
 */
var BaseAxisProps.tick by AxisTickOrNullProp()

/**
 * The option for tickLine
 */
var BaseAxisProps.tickLine by AxisLineOrNullProp()

/**
 * The type of axis
 */
var BaseAxisProps.type by EnumOrNullProp(BaseAxisType::valueOf)

/**
 * The unit of data displayed in the axis
 */
var BaseAxisProps.unit by NumberOrStringOrNullProp()
