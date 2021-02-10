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

package recharts.numberaxis.funnel

import recharts.kotlin.properties.*
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

external interface FunnelProps : InternalFunnelProps {
    var animateNewValues: Boolean?
    var animationBegin: Number?
    var animationDuration: Number?
    var className: String?
    var data: Array<Any>?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?

    //lastShapeType?: 'triangle' | 'rectangle';
    var onAnimationStart: (() -> Unit)?
    var onAnimationEnd: (() -> Unit)?
    var reversed: Boolean?
}

var FunnelProps.activeIndex by FunnelActiveIndexOrNullProp()
var FunnelProps.activeShape by FunnelActiveShapeOrNullProp()
var FunnelProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var FunnelProps.dataKey by DataKeyProp<Any>()
var FunnelProps.legendType by EnumOrNullProp(LegendType::valueOf)
var FunnelProps.nameKey by DataKeyOrNullProp<Any>()
var FunnelProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
