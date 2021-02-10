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

package recharts.cartesian.line

import recharts.kotlin.properties.*
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface LineProps : InternalLineProps {
    var animateNewValues: Boolean?
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var className: String?
    var connectNulls: Boolean?

    //data?: any;
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
}

var LineProps.activeDot by LineDotOrNullProp()
var LineProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var LineProps.dataKey by DataKeyOrNullProp<Any>()
var LineProps.dot by LineDotOrNullProp()
var LineProps.layout by EnumOrNullProp(LineLayout::valueOf)
var LineProps.legendType by EnumOrNullProp(LegendType::valueOf)
var LineProps.name by NumberOrStringOrNullProp()
var LineProps.unit by NumberOrStringOrNullProp()
var LineProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var LineProps.type by CurveTypeOrNullProp()
var LineProps.xAxisId by NumberOrStringOrNullProp()
var LineProps.yAxisId by NumberOrStringOrNullProp()
