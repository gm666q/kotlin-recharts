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

package recharts.polar.polarangleaxis

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.BaseAxisProps
import recharts.util.types.TickItem

external interface PolarAngleAxisProps : BaseAxisProps {
    var cx: Number?
    var cy: Number?
    var radius: Number?
    var ticks: Array<TickItem>?
}

var PolarAngleAxisProps.angleAxisId by NumberOrStringOrNullProp()
var PolarAngleAxisProps.axisLineType by EnumOrNullProp(PolarAngleAxisAxisLineType::valueOf)
var PolarAngleAxisProps.orientation by EnumOrNullProp(PolarAngleAxisOrientation::valueOf)
