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

package recharts.cartesian.xaxis

import recharts.kotlin.properties.AxisIntervalOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberArrayOrStringArrayOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.BaseAxisProps

external interface XAxisProps : BaseAxisProps {
    var angle: Number?
    var height: Number?
    var minTickGap: Number?
    var mirror: Boolean?
    var padding: XAxisPadding?
    var reversed: Boolean?
    var width: Number?
}

var XAxisProps.interval by AxisIntervalOrNullProp()
var XAxisProps.orientation by EnumOrNullProp(XAxisOrientation::valueOf)
var XAxisProps.ticks by NumberArrayOrStringArrayOrNullProp()
var XAxisProps.xAxisId by NumberOrStringOrNullProp()
