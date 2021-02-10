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

package recharts.chart.treemap

import react.ReactElement
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.TreemapNestIndexContentOrNullProp
import recharts.util.types.TreemapNode

// TODO
external interface Props : RechartsProps {
    var animationBegin: Number?
    var animationDuration: Number?
    var animationId: Number?
    var aspectRatio: Number?
    var children: Any?
    var className: String?

    //colorPanel?: [];
    var content: ReactElement?
    var data: Array<Any>?
    var fill: String?
    var height: Number?
    var isAnimationActive: Boolean?
    var isUpdateAnimationActive: Boolean?
    var onAnimationEnd: (() -> Unit)?
    var onAnimationStart: (() -> Unit)?
    var onClick: ((node: TreemapNode) -> Unit)?
    var onMouseEnter: ((node: TreemapNode, e: Any) -> Unit)?
    var onMouseLeave: ((node: TreemapNode, e: Any) -> Unit)?
    var stroke: String?
    var style: Any?
    var width: Number?
}

var Props.animationEasing by EnumOrNullProp(TreemapAnimationEasing::realValueOf)
var Props.dataKey by DataKeyOrNullProp<Any>()
var Props.nameKey by DataKeyOrNullProp<Any>()
var Props.nestIndexContent by TreemapNestIndexContentOrNullProp()
var Props.type by EnumOrNullProp(TreemapType::valueOf)
