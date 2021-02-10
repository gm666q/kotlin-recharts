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

package recharts.cartesian.area

import recharts.kotlin.properties.*
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

external interface AreaProps : InternalAreaProps {
    var animateNewValues: Boolean?
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var className: String?
    var connectNulls: Boolean?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?
    var isRange: Boolean?
    var label: Any?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
}

var AreaProps.activeDot by AreaDotOrNullProp()
var AreaProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var AreaProps.baseValue by AreaBaseValueOrNullProp()
var AreaProps.dataKey by DataKeyProp<Any>()
var AreaProps.dot by AreaDotOrNullProp()
var AreaProps.layout by EnumOrNullProp(AreaLayout::valueOf)
var AreaProps.legendType by EnumOrNullProp(LegendType::valueOf)
var AreaProps.name by NumberOrStringOrNullProp()
var AreaProps.stackId by NumberOrStringOrNullProp()
var AreaProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var AreaProps.type by CurveTypeOrNullProp()
var AreaProps.unit by NumberOrStringOrNullProp()
var AreaProps.xAxisId by NumberOrStringOrNullProp()
var AreaProps.yAxisId by NumberOrStringOrNullProp()
