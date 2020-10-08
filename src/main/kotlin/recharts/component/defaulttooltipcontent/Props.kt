package recharts.component.defaulttooltipcontent

import react.CSSProperties
import recharts.kotlin.RechartsProps

// TODO
external interface Props<TValue : ValueType, TName : NameType> : RechartsProps {
    var contentStyle: CSSProperties?
    var formatter: Function<*>? //Function
    var itemSorter: ((item: Payload<TValue, TName>) -> Any/*number | string*/)?
    var itemStyle: CSSProperties?
    var label: Any?
    var labelClassName: String?
    var labelFormatter: ((label: Any, payload: Array<Payload<TValue, TName>>) -> Any/*ReactNode*/)?
    var labelStyle: CSSProperties?
    var payload: Array<Payload<TValue, TName>>
    var separator: String?
    var wrapperClassName: String?
}
