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

package recharts.util.types

import recharts.kotlin.Union

sealed class ViewBox(name: String, ordinal: Int) : Union<ViewBox>(name, ordinal) {
    data class CartesianViewBox(val value: recharts.util.types.CartesianViewBox) : ViewBox("CartesianViewBox", 0)
    data class PolarViewBox(val value: recharts.util.types.PolarViewBox) : ViewBox("PolarViewBox", 1)

    companion object {
        fun valueOf(value: String): ViewBox {
            throw IllegalArgumentException()
        }

        fun values(): Array<ViewBox> = arrayOf()
    }
}

fun CartesianViewBox.toLabelViewBox() = ViewBox.CartesianViewBox(this)
fun PolarViewBox.toLabelViewBox() = ViewBox.PolarViewBox(this)
