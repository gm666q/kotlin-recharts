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

package recharts.cartesian.referenceline

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

// TODO
external interface ReferenceLineProps : InternalReferenceLineProps {
    var alwaysShow: Boolean?
    var isFront: Boolean?
    /*segment?: Array<{
    x?: number | string;
    y?: number | string;
    }>;*/
    //shape?: ReactElement<SVGElement> | ((props: any) => ReactElement<SVGElement>);
    //label?: ImplicitLabelType;
}

var ReferenceLineProps.className by NumberOrStringOrNullProp()
var ReferenceLineProps.ifOverflow by EnumOrNullProp(ReferenceLineIfOverflow::valueOf)
var ReferenceLineProps.position by EnumOrNullProp(ReferenceLinePosition::valueOf)
var ReferenceLineProps.x by NumberOrStringOrNullProp()
var ReferenceLineProps.xAxisId by NumberOrStringOrNullProp()
var ReferenceLineProps.y by NumberOrStringOrNullProp()
var ReferenceLineProps.yAxisId by NumberOrStringOrNullProp()
