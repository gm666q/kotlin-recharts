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

package recharts.cartesian.bar

import recharts.kotlin.properties.DataKeyProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.kotlin.properties.RectangleShapeTypeOrNullProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface BarProps : InternalBarProps {
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var barSize: Number?
    var className: String?
    var hide: Boolean?
    var id: String?
    var isAnimationActive: Boolean?

    /*label?:
    | boolean
    | ReactElement<SVGElement>
    | ((props: any) => ReactElement<SVGElement>)
    | {
        id?: string;
        valueAccessor?: Function;
        dataKey?: DataKey<any>;
        content?: ContentType;
    };*/
    var maxBarSize: Number?
    var minPointSize: Number?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
    //radius?: number | [number, number, number, number];
    //shape?: ReactElement<SVGElement> | ((props: any) => ReactElement<SVGElement>);
}

var BarProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var BarProps.background by RectangleShapeTypeOrNullProp()
var BarProps.dataKey by DataKeyProp<Any>()
var BarProps.layout by EnumOrNullProp(BarLayout::valueOf)
var BarProps.legendType by EnumOrNullProp(LegendType::valueOf)
var BarProps.name by NumberOrStringOrNullProp()
var BarProps.stackId by NumberOrStringOrNullProp()
var BarProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var BarProps.unit by NumberOrStringOrNullProp()
var BarProps.xAxisId by NumberOrStringOrNullProp()
var BarProps.yAxisId by NumberOrStringOrNullProp()
