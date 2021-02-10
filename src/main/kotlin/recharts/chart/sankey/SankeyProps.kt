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

package recharts.chart.sankey

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp
import recharts.util.types.Margin

// TODO
external interface SankeyProps : RechartsProps {
    var children: Any?
    var className: String?
    var data: SankeyData
    var height: Number?
    var iterations: Number?

    //link?: SankeyLinkOptions;
    var linkCurvature: Number?
    var margin: Margin?

    //node?: SankeyNodeOptions;
    var nodePadding: Number?
    var nodeWidth: Number?
    var onClick: Any?
    var onMouseEnter: Any?
    var onMouseLeave: Any?
    var style: Any?
    var width: Number?
}

var SankeyProps.dataKey by DataKeyOrNullProp<Any>()
var SankeyProps.nameKey by DataKeyOrNullProp<Any>()
