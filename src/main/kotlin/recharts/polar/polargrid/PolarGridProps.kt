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

package recharts.polar.polargrid

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp

external interface PolarGridProps : RechartsProps {
    var cx: Number?
    var cy: Number?
    var innerRadius: Number?
    var outerRadius: Number?
    var polarAngles: Array<Number>?
    var polarRadius: Array<Number>?
}

var PolarGridProps.gridType by EnumOrNullProp(PolarGridGridType::valueOf)
