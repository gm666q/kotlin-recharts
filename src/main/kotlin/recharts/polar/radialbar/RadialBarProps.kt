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

package recharts.polar.radialbar

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface RadialBarProps : RechartsProps {
    var activeIndex: Number?

    //activeShape?: RadialBarShape;
    var animationBegin: Number?
    var animationDuration: Number?

    //background?: RadialBarBackground
    var className: String?
    var cornerIsExternal: Boolean?
    var data: Array<RadialBarDataItem>?
    var endAngle: Number?
    var forceCornerRadius: Boolean?
    var hide: Boolean?
    var isAnimationActive: Boolean?

    //label?: ImplicitLabelListType<any>;
    var maxBarSize: Number?
    var minPointSize: Number?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?

    //shape?: RadialBarShape;
    var startAngle: Number?
}

var RadialBarProps.angleAxisId by NumberOrStringOrNullProp()
var RadialBarProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var RadialBarProps.animationId by NumberOrStringOrNullProp()
var RadialBarProps.cornerRadius by NumberOrStringOrNullProp()
var RadialBarProps.dataKey by DataKeyProp<Any>()
var RadialBarProps.legendType by EnumOrNullProp(LegendType::valueOf)
var RadialBarProps.radiusAxisId by NumberOrStringOrNullProp()
var RadialBarProps.stackId by NumberOrStringOrNullProp()
var RadialBarProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
