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

package recharts.polar.pie

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface PieProps : PieDef, RechartsProps {
    //activeIndex?: number | number[];
    //activeShape?: PieActiveShape;
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var blendStroke: Boolean?
    var className: String?
    var data: Array<Any>?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?

    //label?: PieLabel;
    //labelLine?: PieLabelLine;
    var maxRadius: Number?
    var minAngle: Number?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?

    //onClick?: (data: any, index: number, e: React.MouseEvent) => void;
    //onMouseEnter?: (data: any, index: number, e: React.MouseEvent) => void;
    //onMouseLeave?: (data: any, index: number, e: React.MouseEvent) => void;
    var sectors: Array<PieSectorDataItem>?
}

var PieProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var PieProps.dataKey by DataKeyProp<Any>()
var PieProps.legendType by EnumOrNullProp(LegendType::valueOf)
var PieProps.nameKey by DataKeyOrNullProp<Any>()
var PieProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var PieProps.valueKey by DataKeyOrNullProp<Any>()
