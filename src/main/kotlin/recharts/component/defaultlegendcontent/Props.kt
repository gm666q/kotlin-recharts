package recharts.component.defaultlegendcontent

import org.w3c.dom.events.MouseEvent
import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.LayoutType

external interface Props<TValue, TID> : RechartsProps {
    var content: ContentType<TValue, TID>?
    var formatter: Formatter<TValue, TID>
    var iconSize: Number?
    var inactiveColor: String?
    var onClick: ((event: MouseEvent) -> Unit)?
    var onMouseEnter: ((event: MouseEvent) -> Unit)?
    var onMouseLeave: ((event: MouseEvent) -> Unit)?
    var payload: Array<Payload<TValue, TID>>?
}

var <TValue, TID> Props<TValue, TID>.align by EnumOrNullProp(HorizontalAlignmentType::valueOf)
var <TValue, TID> Props<TValue, TID>.iconType by EnumOrNullProp(IconType::valueOf)
var <TValue, TID> Props<TValue, TID>.layout by EnumOrNullProp(LayoutType::valueOf)
var <TValue, TID> Props<TValue, TID>.verticalAlign by EnumOrNullProp(VerticalAlignmentType::valueOf)
