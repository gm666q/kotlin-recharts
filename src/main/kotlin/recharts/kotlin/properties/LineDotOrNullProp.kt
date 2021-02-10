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

import org.w3c.dom.svg.SVGElement
import recharts.cartesian.line.LineDot
import recharts.cartesian.line.LineProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LineDotOrNullProp : ReadWriteProperty<LineProps, LineDot?> {
    override fun getValue(thisRef: LineProps, property: KProperty<*>): LineDot? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> LineDot.Boolean(value)
            //is DotProps -> LineDot.DotProps(value as DotProps)
            is (props: Any) -> SVGElement -> LineDot.Function(value)
            //is ReactElement/*<SVGElement>*/ -> LineDot.ReactElement(value as ReactElement/*<SVGElement>*/)
            else -> null
        }

    override fun setValue(thisRef: LineProps, property: KProperty<*>, value: LineDot?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is LineDot.Boolean -> value.value
            is LineDot.DotProps -> value.value
            is LineDot.Function -> value.value
            is LineDot.ReactElement -> value.value
            null -> null
        }
    }
}
