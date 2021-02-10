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

package recharts.cartesian.scatter

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.CurveTypeOrNullProp
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.AnimationTiming
import recharts.util.types.LegendType
import recharts.util.types.TooltipType

// TODO
external interface ScatterProps : RechartsProps {
    var activeIndex: Number?

    //activeShape?: ReactElement<SVGElement> | ((props: any) => ReactElement<SVGElement>) | SymbolsProps;
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var className: String?
    var data: Array<Any>?
    var hide: Boolean?
    var isAnimationActive: Boolean?

    //label?: ImplicitLabelListType<any>;
    var left: Number?

    //line?: ReactElement<SVGElement> | ((props: any) => ReactElement<SVGElement>) | CurveProps | boolean;
    var points: Array<ScatterPointItem>?

    //shape?: SymbolType | ReactElement<SVGElement> | ((props: any) => ReactElement<SVGElement>);
    var top: Number?
    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    //zAxis?: Omit<ZAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}

var ScatterProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
var ScatterProps.dataKey by DataKeyOrNullProp<Any>()
var ScatterProps.legendType by EnumOrNullProp(LegendType::valueOf)
var ScatterProps.lineJointType by CurveTypeOrNullProp()
var ScatterProps.lineType by EnumOrNullProp(ScatterLineType::valueOf)
var ScatterProps.name by NumberOrStringOrNullProp()
var ScatterProps.tooltipType by EnumOrNullProp(TooltipType::valueOf)
var ScatterProps.xAxisId by NumberOrStringOrNullProp()
var ScatterProps.yAxisId by NumberOrStringOrNullProp()
var ScatterProps.zAxisId by NumberOrStringOrNullProp()
