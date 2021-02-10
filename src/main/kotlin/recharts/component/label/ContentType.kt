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

// TODO
sealed class ContentType(name: String, ordinal: Int) : Union<ContentType>(name, ordinal) {
    //data class Function(val value: (props: Props) -> ReactNode) : ContentType("Function", 0)
    data class ReactElement(val value: react.ReactElement) : ContentType("ReactElement", 1)

    companion object {
        fun valueOf(value: String): ContentType {
            throw IllegalArgumentException()
        }

        fun values(): Array<ContentType> = arrayOf()
    }
}

fun ReactElement.toLabelContentType() = ContentType.ReactElement(this)
