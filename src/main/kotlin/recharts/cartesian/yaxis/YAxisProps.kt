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

package recharts.cartesian.yaxis

import recharts.kotlin.properties.AxisIntervalOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberArrayOrStringArrayOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.BaseAxisProps

external interface YAxisProps : BaseAxisProps {
    var height: Number?
    var minTickGap: Number?
    var mirror: Boolean?
    var padding: YAxisPadding
    var reversed: Boolean?
    var width: Number?
}

var YAxisProps.interval by AxisIntervalOrNullProp()
var YAxisProps.orientation by EnumOrNullProp(YAxisOrientation::valueOf)
var YAxisProps.ticks by NumberArrayOrStringArrayOrNullProp()
var YAxisProps.yAxisId by NumberOrStringOrNullProp()
