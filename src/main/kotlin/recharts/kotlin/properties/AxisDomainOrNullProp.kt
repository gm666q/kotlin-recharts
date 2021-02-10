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

import recharts.kotlin.RechartsProps
import recharts.util.types.AxisDomainItem
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisDomainOrNullProp : ReadWriteProperty<RechartsProps, Pair<AxisDomainItem, AxisDomainItem>?> {
    private fun getInnerValue(value: Any?) = when (value) {
        is Function<*> -> AxisDomainItem.Function(value)
        is Number -> AxisDomainItem.Number(value)
        is String -> try {
            AxisDomainItem.valueOf(value)
        } catch (e: IllegalArgumentException) {
            AxisDomainItem.String(value)
        }
        else -> throw NoWhenBranchMatchedException()
    }

    override fun getValue(thisRef: RechartsProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Array<*> -> if (value.size == 2) Pair(getInnerValue(value[0]), getInnerValue(value[1])) else null
            else -> null
        }

    private fun setInnerValue(value: AxisDomainItem) = when (value) {
        is AxisDomainItem.Function -> value.value
        is AxisDomainItem.Number -> value.value
        is AxisDomainItem.String -> value.value
        else -> value.name
    }

    override fun setValue(
        thisRef: RechartsProps,
        property: KProperty<*>,
        value: Pair<AxisDomainItem, AxisDomainItem>?
    ) {
        thisRef.asDynamic()[property.name] =
            if (value == null) null else arrayOf(setInnerValue(value.first), setInnerValue(value.second))
    }
}
