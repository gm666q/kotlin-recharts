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

package recharts.polar.radar

import org.w3c.dom.events.MouseEvent
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface RadarProps : RechartsProps {
    //activeDot?: RadarDot;
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var baseLinePoints: Array<RadarPoint>?
    var className: String?
    var connectNulls: Boolean?

    //dot?: RadarDot;
    var hide: Boolean?
    var isAnimationActive: Boolean?
    var isRange: Boolean?
    var label: Any?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
    var onMouseEnter: ((props: Any, e: MouseEvent/*<SVGPolygonElement>*/) -> Unit)?
    var onMouseLeave: ((props: Any, e: MouseEvent/*<SVGPolygonElement>*/) -> Unit)?
    var points: Array<RadarPoint>?
    //shape?: ReactElement<SVGElement> | ((props: any) => ReactElement<SVGElement>);
}

var RadarProps.angleAxisId by NumberOrStringOrNullProp()
var RadarProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var RadarProps.dataKey by DataKeyProp<Any>()
var RadarProps.legendType by EnumOrNullProp(LegendType::valueOf)
var RadarProps.radiusAxisId by NumberOrStringOrNullProp()
var RadarProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
