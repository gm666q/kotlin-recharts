package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import react.ReactElement
import react.rClass
import recharts.component.defaulttooltipcontent.NameType
import recharts.component.defaulttooltipcontent.ValueType
import recharts.component.legend.Legend
import recharts.component.tooltip.Tooltip
import recharts.component.tooltip.TooltipProps
import kotlin.reflect.KClass
import recharts.component.legend.Props as LegendProps

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

internal fun <TValue, TID> RBuilder.child(
    klazz: KClass<out Legend<*, *>>,
    handler: RHandler<LegendProps<TValue, TID>>
): ReactElement =
    (klazz as KClass<out Legend<TValue, TID>>).rClass.invoke(handler)

internal fun <TValue : ValueType, TName : NameType> RBuilder.child(
    klazz: KClass<out Tooltip<*, *>>,
    handler: RHandler<TooltipProps<TValue, TName>>
): ReactElement =
    (klazz as KClass<out Tooltip<TValue, TName>>).rClass.invoke(handler)
