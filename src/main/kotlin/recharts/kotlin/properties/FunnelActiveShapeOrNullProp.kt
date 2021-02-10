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

import react.ReactElement
import recharts.numberaxis.funnel.FunnelActiveShape
import recharts.numberaxis.funnel.FunnelProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FunnelActiveShapeOrNullProp : ReadWriteProperty<FunnelProps, FunnelActiveShape?> {
    override fun getValue(thisRef: FunnelProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is (props: Any) -> ReactElement/*<SVGElement>*/ -> FunnelActiveShape.Function(value)
            //is ReactElement -> FunnelActiveShape.ReactElement(value as ReactElement)
            //is TrapezoidProps -> FunnelActiveShape.TrapezoidProps(value as TrapezoidProps)
            else -> null
        }

    override fun setValue(thisRef: FunnelProps, property: KProperty<*>, value: FunnelActiveShape?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is FunnelActiveShape.Function -> value.value
            is FunnelActiveShape.ReactElement -> value.value
            is FunnelActiveShape.TrapezoidProps -> value.value
            null -> null
        }
    }
}
