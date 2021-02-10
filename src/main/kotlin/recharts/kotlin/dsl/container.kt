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
import react.child
import recharts.container.layer.Layer
import recharts.container.surface.Surface
import recharts.container.layer.Props as LayerProps
import recharts.container.surface.Props as SurfaceProps

fun RBuilder.layer(handler: RHandler<LayerProps>) = child(Layer) { handler.invoke(this) }

fun RBuilder.surface(handler: RHandler<SurfaceProps>) = child(Surface) { handler.invoke(this) }
