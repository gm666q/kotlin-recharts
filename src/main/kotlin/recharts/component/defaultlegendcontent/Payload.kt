package recharts.component.defaultlegendcontent

import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.LegendType

external interface Payload<TValue, TID> {
    var color: String
    var formatter: Formatter<TValue, TID>?
    var id: TID
    var inactive: Boolean?

    /*payload: {
    strokeDasharray: ReactText;
    };*/
    var value: TValue
}

var <TValue, TID> Payload<TValue, TID>.type by EnumOrNullProp(LegendType::valueOf)
