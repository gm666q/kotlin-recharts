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

package recharts.numberaxis.funnel

import react.ReactElement
import recharts.kotlin.Union
import recharts.shape.trapezoid.Props

sealed class FunnelActiveShape(name: String, ordinal: Int) : Union<FunnelActiveShape>(name, ordinal) {
    data class Function(val value: (props: Any) -> react.ReactElement/*<SVGElement>*/) :
        FunnelActiveShape("Function", 0)

    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : FunnelActiveShape("ReactElement", 1)
    data class TrapezoidProps(val value: Props) : FunnelActiveShape("TrapezoidProps", 2)

    companion object {
        fun valueOf(value: String): FunnelActiveShape {
            throw IllegalArgumentException()
        }

        fun values(): Array<FunnelActiveShape> = arrayOf()
    }
}

fun ((props: Any) -> ReactElement/*<SVGElement>*/).toFunnelActiveShape() = FunnelActiveShape.Function(this)
fun ReactElement.toFunnelActiveShape() = FunnelActiveShape.ReactElement(this)
fun Props.toFunnelActiveShape() = FunnelActiveShape.TrapezoidProps(this)
