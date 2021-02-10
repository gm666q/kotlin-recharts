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

package recharts.cartesian.referencearea

import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp

// TODO
external interface ReferenceAreaProps : InternalReferenceAreaProps {
    var alwaysShow: Boolean?
    var isFront: Boolean?
    //shape?: ReactElement<SVGElement> | ((props: any) => SVGElement);
}

var ReferenceAreaProps.className by NumberOrStringOrNullProp()
var ReferenceAreaProps.ifOverflow by EnumOrNullProp(ReferenceAreaIfOverflow::valueOf)
var ReferenceAreaProps.x1 by NumberOrStringOrNullProp()
var ReferenceAreaProps.x2 by NumberOrStringOrNullProp()
var ReferenceAreaProps.xAxisId by NumberOrStringOrNullProp()
var ReferenceAreaProps.y1 by NumberOrStringOrNullProp()
var ReferenceAreaProps.y2 by NumberOrStringOrNullProp()
var ReferenceAreaProps.yAxisId by NumberOrStringOrNullProp()
