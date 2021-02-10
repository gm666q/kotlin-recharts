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

package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import react.ReactElement
import react.rClass
import recharts.component.defaulttooltipcontent.NameType
import recharts.component.defaulttooltipcontent.ValueType
import recharts.component.tooltip.Tooltip
import recharts.component.tooltip.TooltipProps
import kotlin.reflect.KClass

/*internal fun <TValue, TID> RBuilder.child(
    klazz: KClass<out DefaultLegendContent<*, *>>,
    handler: RHandler<DefaultLegendContentProps<TValue, TID>>
): ReactElement =
    (klazz as KClass<out DefaultLegendContent<TValue, TID>>).rClass.invoke(handler)*/

/*internal fun <TValue : ValueType, TName : NameType> RBuilder.child(
    klazz: KClass<out DefaultTooltipContent<*, *>>,
    handler: RHandler<DefaultTooltipContentProps<TValue, TName>>
): ReactElement =
    (klazz as KClass<out DefaultTooltipContent<TValue, TName>>).rClass.invoke(handler)*/

internal fun <TValue : ValueType, TName : NameType> RBuilder.child(
    klazz: KClass<out Tooltip<*, *>>,
    handler: RHandler<TooltipProps<TValue, TName>>
): ReactElement =
    (klazz as KClass<out Tooltip<TValue, TName>>).rClass.invoke(handler)
