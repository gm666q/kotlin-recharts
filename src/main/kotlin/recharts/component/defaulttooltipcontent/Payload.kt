package recharts.component.defaulttooltipcontent

// TODO
external interface Payload<TValue : ValueType, TName : NameType> {
    var color: String?
    var formatter: Formatter<TValue, TName>?
    var name: TName?

    //var unit: ReactNode?
    var value: TValue?
}

//var Payload.dataKey by NullNumberOrStringProp()
//var Payload.type by EnumOrNullProp(TooltipType::valueOf)
