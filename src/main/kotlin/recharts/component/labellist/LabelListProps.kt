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

package recharts.component.labellist

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp

// TODO
external interface LabelListProps<T : Data> : RechartsProps {
    var angle: Number?
    var clockWise: Boolean?

    //content?: ContentType;
    var data: Array<T>?
    var id: String?

    //position?: LabelProps['position'];
    var textBreakAll: Boolean?
    var valueAccessor: Function<*>? //Function
}

var <T : Data> LabelListProps<T>.dataKey by DataKeyOrNullProp<T>()
