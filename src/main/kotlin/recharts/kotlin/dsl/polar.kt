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

package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import recharts.polar.pie.Pie
import recharts.polar.polarangleaxis.PolarAngleAxis
import recharts.polar.polargrid.PolarGrid
import recharts.polar.polarradiusaxis.PolarRadiusAxis
import recharts.polar.radar.Radar
import recharts.polar.radialbar.RadialBar
import recharts.polar.pie.Props as PieProps
import recharts.polar.polarangleaxis.Props as PolarAngleAxisProps
import recharts.polar.polargrid.Props as PolarGridProps
import recharts.polar.polarradiusaxis.Props as PolarRadiusAxisProps
import recharts.polar.radar.Props as RadarProps
import recharts.polar.radialbar.Props as RadialBarProps

fun RBuilder.pie(handler: RHandler<PieProps>) = child(Pie::class) { handler.invoke(this) }

fun RBuilder.polarAngleAxis(handler: RHandler<PolarAngleAxisProps>) =
    child(PolarAngleAxis::class) { handler.invoke(this) }

fun RBuilder.polarGrid(handler: RHandler<PolarGridProps>) = child(PolarGrid::class) { handler.invoke(this) }

fun RBuilder.polarRadiusAxis(handler: RHandler<PolarRadiusAxisProps>) =
    child(PolarRadiusAxis::class) { handler.invoke(this) }

fun RBuilder.radar(handler: RHandler<RadarProps>) = child(Radar::class) { handler.invoke(this) }

fun RBuilder.radialBar(handler: RHandler<RadialBarProps>) = child(RadialBar::class) { handler.invoke(this) }
