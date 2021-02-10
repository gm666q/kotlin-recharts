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

import recharts.chart.treemap.Props
import recharts.chart.treemap.TreemapNestIndexContent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class TreemapNestIndexContentOrNullProp : ReadWriteProperty<Props, TreemapNestIndexContent?> {
    override fun getValue(thisRef: Props, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is (item: Any, i: Number) -> Any -> TreemapNestIndexContent.Function(value)
            //is ReactElement -> NestIndexContent.ReactElement(value as ReactElement)
            else -> null
        }

    override fun setValue(thisRef: Props, property: KProperty<*>, value: TreemapNestIndexContent?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is TreemapNestIndexContent.Function -> value.value
            is TreemapNestIndexContent.ReactElement -> value.value
            null -> null
        }
    }
}
