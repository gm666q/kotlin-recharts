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

package recharts.cartesian.cartesianaxis

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.kotlin.properties.NumberOrStringOrNullProp
import recharts.util.types.CartesianViewBox

external interface CartesianAxisProps : RechartsProps {
    //axisLine?: boolean | SVGProps<SVGLineElement>;
    var className: String?
    var height: Number?
    var hide: Boolean?

    //interval?: number | 'preserveStart' | 'preserveEnd' | 'preserveStartEnd';
    //label?: any;
    var minTickGap: Number?
    var mirror: Boolean?

    //tick?: SVGProps<SVGTextElement> | ReactElement<SVGElement> | ((props: any) => ReactElement<SVGElement>) | boolean;
    var tickFormatter: ((value: Any, index: Number) -> String)?

    //tickLine?: boolean | SVGProps<SVGLineElement>;
    var tickMargin: Number?
    var tickSize: Number?
    var ticks: Array<CartesianTickItem>?
    var ticksGenerator: ((props: CartesianAxisProps?) -> Array<CartesianTickItem>)?
    var viewBox: CartesianViewBox?
    var width: Number?
    var x: Number?
    var y: Number?
}

var CartesianAxisProps.orientation by EnumOrNullProp(CartesianAxisOrientation::valueOf)
var CartesianAxisProps.unit by NumberOrStringOrNullProp()
