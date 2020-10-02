package recharts.shape.symbols

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.SymbolType

external interface SymbolsProps : RechartsProps {
    var className: String?
    var cx: Number?
    var cy: Number?
    var size: Number?
}

val SymbolsProps.sizeType by EnumOrNullProp(SizeType::valueOf)
val SymbolsProps.type by EnumOrNullProp(SymbolType::valueOf)
