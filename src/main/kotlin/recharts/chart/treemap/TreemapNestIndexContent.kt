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

package recharts.chart.treemap

import react.ReactElement
import recharts.kotlin.Union

sealed class TreemapNestIndexContent(name: String, ordinal: Int) : Union<TreemapNestIndexContent>(name, ordinal) {
    data class Function(val value: (item: Any, i: Number) -> Any) : TreemapNestIndexContent("Function", 0)
    data class ReactElement(val value: react.ReactElement) : TreemapNestIndexContent("ReactElement", 1)

    companion object {
        fun valueOf(value: String): TreemapNestIndexContent {
            throw IllegalArgumentException()
        }

        fun values(): Array<TreemapNestIndexContent> = arrayOf()
    }
}

fun ((item: Any, i: Number) -> Any).toTreemapNestIndexContent() = TreemapNestIndexContent.Function(this)
fun ReactElement.toTreemapNestIndexContent() = TreemapNestIndexContent.ReactElement(this)
