package recharts.component.labellist

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.DataKeyOrNullProp

// TODO
external interface Props<T: Data> : RechartsProps {
    var clockWise: Boolean?
    //content?: ContentType;
    var data: Array<T>
    var id: String?
    var valueAccessor: Function<*>? //Function
}

var <T: Data> Props<T>.dataKey by DataKeyOrNullProp<T>()
