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

package recharts.component.defaultlegendcontent

import org.w3c.dom.events.MouseEvent
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.LayoutType

external interface InternalProps : RechartsProps {
    var content: ContentType?
    var formatter: Formatter?
    var iconSize: Number?
    var inactiveColor: String?
    var onClick: ((event: MouseEvent) -> Unit)?
    var onMouseEnter: ((event: MouseEvent) -> Unit)?
    var onMouseLeave: ((event: MouseEvent) -> Unit)?
    var payload: Array<Payload>?
}

var InternalProps.align by EnumOrNullProp(HorizontalAlignmentType::valueOf)
var InternalProps.iconType by EnumOrNullProp(IconType::valueOf)
var InternalProps.layout by EnumOrNullProp(LayoutType::valueOf)
var InternalProps.verticalAlign by EnumOrNullProp(VerticalAlignmentType::valueOf)
