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

import react.ReactElement
import recharts.kotlin.Union

sealed class ImplicitLabelType(name: kotlin.String, ordinal: Int) : Union<ImplicitLabelType>(name, ordinal) {
    data class Boolean(val value: kotlin.Boolean) : ImplicitLabelType("Boolean", 0)
    data class Function(val value: (props: Any) -> react.ReactElement/*<SVGElement>*/) :
        ImplicitLabelType("Function", 1)

    data class Number(val value: kotlin.Number) : ImplicitLabelType("Number", 2)
    data class Props(val value: recharts.component.label.Props) : ImplicitLabelType("Props", 3)
    data class ReactElement(val value: react.ReactElement/*<SVGElement>*/) : ImplicitLabelType("ReactElement", 4)
    data class String(val value: kotlin.String) : ImplicitLabelType("String", 5)

    companion object {
        fun valueOf(value: kotlin.String): ImplicitLabelType {
            throw IllegalArgumentException()
        }

        fun values(): Array<ImplicitLabelType> = arrayOf()
    }
}

fun Boolean.toImplicitLabelType() = ImplicitLabelType.Boolean(this)
fun ((props: Any) -> ReactElement/*<SVGElement>*/).toImplicitLabelType() = ImplicitLabelType.Function(this)
fun Number.toImplicitLabelType() = ImplicitLabelType.Number(this)
fun Props.toImplicitLabelType() = ImplicitLabelType.Props(this)
fun ReactElement/*<SVGElement>*/.toImplicitLabelType() = ImplicitLabelType.ReactElement(this)
fun String.toImplicitLabelType() = ImplicitLabelType.String(this)
