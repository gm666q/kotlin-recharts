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

import recharts.kotlin.properties.NumberOrStringOrNullProp

external interface PieDef {
    var endAngle: Number?
    var paddingAngle: Number?
    var startAngle: Number?
}

var PieDef.cornerRadius by NumberOrStringOrNullProp()
var PieDef.cx by NumberOrStringOrNullProp()
var PieDef.cy by NumberOrStringOrNullProp()
var PieDef.innerRadius by NumberOrStringOrNullProp()
var PieDef.outerRadius by NumberOrStringOrNullProp()
