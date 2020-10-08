package recharts.component.defaulttooltipcontent

// TODO
typealias Formatter<TValue/*: ValueType*/, TName/*: NameType*/> = (
    value: TValue,
    name: TName,
    item: Payload<TValue, TName>,
    index: Number,
    payload: Array<Payload<TValue, TName>>
) -> Any/*[ReactNode, ReactNode] | ReactNode*/
