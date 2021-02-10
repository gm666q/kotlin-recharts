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

import recharts.util.types.ViewBox
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ViewBoxOrNullProp : ReadWriteProperty<Any, ViewBox?> {
    override fun getValue(thisRef: Any, property: KProperty<*>): ViewBox? =
        when (val value = thisRef.asDynamic()[property.name]) {
            //is CartesianViewBox -> ViewBox.CartesianViewBox(value as CartesianViewBox)
            //is PolarViewBox -> ViewBox.CartesianViewBox(value as PolarViewBox)
            else -> null
        }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: ViewBox?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is ViewBox.CartesianViewBox -> value.value
            is ViewBox.PolarViewBox -> value.value
            null -> null
        }
    }
}
