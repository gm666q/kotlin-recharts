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

package recharts.chart.generatecategoricalchart

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.LayoutType
import recharts.util.types.Margin

external interface CategoricalChartProps : RechartsProps {
    var className: String?
    var compact: Boolean?
    var data: Array<Any>?
    var defaultShowTooltip: Boolean?
    var endAngle: Number?
    var height: Number?
    var id: String?
    var margin: Margin?
    var maxBarSize: Number?
    var onClick: Any?
    var onMouseDown: Any?
    var onMouseEnter: Any?
    var onMouseLeave: Any?
    var onMouseMove: Any?
    var onMouseUp: Any?
    var reverseStackOrder: Boolean?
    var startAngle: Number?
    var style: Any?
    var throttleDelay: Number?
    var width: Number?
}

var CategoricalChartProps.barCategoryGap by NumberOrStringOrNullProp()
var CategoricalChartProps.barGap by NumberOrStringOrNullProp()
var CategoricalChartProps.barSize by NumberOrStringOrNullProp()
var CategoricalChartProps.cx by NumberOrStringOrNullProp()
var CategoricalChartProps.cy by NumberOrStringOrNullProp()
var CategoricalChartProps.innerRadius by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.layout by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.outerRadius by EnumOrNullProp(LayoutType::valueOf)
var CategoricalChartProps.stackOffset by EnumOrNullProp(CategoricalChartStackOffset::valueOf)
var CategoricalChartProps.syncId by NumberOrStringOrNullProp()
