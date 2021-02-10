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

package recharts.util.types

external interface ChartCoordinate : Coordinate {
    var angle: Number?
    var cx: Number?
    var cy: Number?
    var endAngle: Number?
    var height: Any?
    var innerRadius: Number?
    var offset: ChartOffset?
    var outerRadius: Number?
    var radius: Number?
    var startAngle: Number?
    var width: Any?
    var xAxis: Any?
    var yAxis: Any?
}
