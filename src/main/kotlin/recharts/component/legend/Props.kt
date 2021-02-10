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

package recharts.component.legend

import react.CSSProperties
import recharts.component.defaultlegendcontent.Props as DefaultProps

// TODO
external interface Props : DefaultProps {
    var chartHeight: Number?
    var chartWidth: Number?
    var height: Number?

    /*margin?: {
        top?: number;
        left ?: number;
        bottom ?: number;
        right?: number;
    };*/
    //onBBoxUpdate?: (box: DOMRect | null) => void;
    var payloadUniqBy: UniqueOption?
    var width: Number?
    var wrapperStyle: CSSProperties?
}
