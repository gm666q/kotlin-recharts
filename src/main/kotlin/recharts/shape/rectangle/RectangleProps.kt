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

package recharts.shape.rectangle

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.AnimationTiming

external interface RectangleProps : RechartsProps {
    var animationBegin: Number?
    var animationDuration: Number?
    var className: String?
    var height: Number?

    //radius?: number | RectRadius;
    var isAnimationActive: Boolean?
    var isUpdateAnimationActive: Boolean?
    var width: Number?
    var x: Number?
    var y: Number?
}

var RectangleProps.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
