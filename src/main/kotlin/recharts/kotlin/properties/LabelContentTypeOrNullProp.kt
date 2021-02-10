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

package recharts.kotlin.properties

import recharts.component.label.ContentType
import recharts.component.label.LabelProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LabelContentTypeOrNullProp : ReadWriteProperty<LabelProps, ContentType?> {
    override fun getValue(thisRef: LabelProps, property: KProperty<*>): ContentType? =
        when (val value = thisRef.asDynamic()[property.name]) {
            //is (props: Props) -> ReactNode -> LabelContentType.Function(value as (props: Props) -> ReactNode)
            //is ReactElement -> LabelContentType.ReactElement(value as ReactElement)
            else -> null
        }

    override fun setValue(thisRef: LabelProps, property: KProperty<*>, value: ContentType?) {
        thisRef.asDynamic()[property.name] = when (value) {
            //is LabelContentType.Function -> value.value
            is ContentType.ReactElement -> value.value
            null -> null
        }
    }
}
