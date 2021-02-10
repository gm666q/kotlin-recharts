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

import react.ReactElement
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.LegendType

// TODO
external interface Payload {
    var color: String?
    var formatter: Formatter?
    var id: String?
    var inactive: Boolean?
    var legendIcon: ReactElement/*<SVGElement>*/?

    /*payload?: {
        strokeDasharray: ReactText;
    };*/
    var value: Any
}

var Payload.type by EnumOrNullProp(LegendType::valueOf)
