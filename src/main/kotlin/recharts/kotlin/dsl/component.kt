package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import react.child
import recharts.component.cell.Cell
import recharts.component.defaulttooltipcontent.NameType
import recharts.component.defaulttooltipcontent.ValueType
import recharts.component.label.Label
import recharts.component.labellist.Data
import recharts.component.labellist.LabelList
import recharts.component.legend.Legend
import recharts.component.responsivecontainer.ResponsiveContainer
import recharts.component.text.Text
import recharts.component.tooltip.Tooltip
import recharts.component.tooltip.TooltipProps
import recharts.component.cell.Props as CellProps
import recharts.component.label.Props as LabelProps
import recharts.component.labellist.Props as LabelListProps
import recharts.component.legend.Props as LegendProps
import recharts.component.responsivecontainer.Props as ResponsiveContainerProps
import recharts.component.text.Props as TextProps

fun RBuilder.cell(handler: RHandler<CellProps>) = child(Cell) { handler.invoke(this) }

fun RBuilder.label(handler: RHandler<LabelProps>) = child(Label) { handler.invoke(this) }

fun RBuilder.labelList(handler: RHandler<LabelListProps<Data>>) = child(LabelList) { handler.invoke(this) }

//fun <T : Data> RBuilder.labelList(handler: RHandler<LabelListProps<T>>) = child(LabelList) { handler.invoke(this) }

fun RBuilder.legend(handler: RHandler<LegendProps<Number, Number>>) =
    child<Number, Number>(Legend::class) { handler.invoke(this) }

fun <TValue, TID> RBuilder.legend(handler: RHandler<LegendProps<TValue, TID>>) =
    child<TValue, TID>(Legend::class) { handler.invoke(this) }

fun RBuilder.responsiveContainer(handler: RHandler<ResponsiveContainerProps>) =
    child(ResponsiveContainer::class) { handler.invoke(this) }

fun RBuilder.text(handler: RHandler<TextProps>) = child(Text::class) { handler.invoke(this) }

fun RBuilder.tooltip(handler: RHandler<TooltipProps<Number, String>>) =
    child<Number, String>(Tooltip::class) { handler.invoke(this) }

fun <TValue : ValueType, TName : NameType> RBuilder.tooltip(handler: RHandler<TooltipProps<TValue, TName>>) =
    child<TValue, TName>(Tooltip::class) { handler.invoke(this) }
