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

package recharts.component.label

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.LabelContentTypeOrNullProp
import recharts.kotlin.properties.LabelPositionOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.kotlin.properties.ViewBoxOrNullProp

// TODO
external interface LabelProps : RechartsProps {
    var angle: Number?

    //children?: ReactNode;
    var className: String?
    var formatter: Function<*>? //Function
    var offset: Number?
    var textBreakAll: Boolean?
}

var LabelProps.content by LabelContentTypeOrNullProp()
var LabelProps.parentViewBox by ViewBoxOrNullProp()
var LabelProps.position by LabelPositionOrNullProp()
var LabelProps.value by NumberOrStringOrNullProp()
var LabelProps.viewBox by ViewBoxOrNullProp()
