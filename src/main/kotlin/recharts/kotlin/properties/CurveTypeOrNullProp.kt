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

import d3.shape.CurveFactory
import recharts.kotlin.RechartsProps
import recharts.shape.curve.CurveType
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class CurveTypeOrNullProp : ReadWriteProperty<RechartsProps, CurveType?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>): CurveType? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is CurveFactory -> CurveType.CurveFactory(value)
            is String -> try {
                CurveType.valueOf(value)
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: CurveType?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is CurveType.CurveFactory -> value.value
            null -> null
            else -> value.name
        }
    }
}
