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

package recharts.cartesian.cartesiangrid

import recharts.kotlin.RechartsProps
import recharts.util.types.ChartOffset

external interface IntrnalCartesianGridProps : RechartsProps {
    var chartHeight: Number?
    var chartWidth: Number?
    var height: Number?
    var horizontalCoordinatesGenerator: ((props: Any) -> Array<Number>)?
    var offset: ChartOffset?
    var verticalCoordinatesGenerator: ((props: Any) -> Array<Number>)?
    var width: Number?
    var x: Number?

    //xAxis?: Omit<XAxisProps, 'scale'> & { scale: D3Scale<string | number> };
    var y: Number?
    //yAxis?: Omit<YAxisProps, 'scale'> & { scale: D3Scale<string | number> };
}
