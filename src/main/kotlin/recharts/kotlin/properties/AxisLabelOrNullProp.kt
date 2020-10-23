package recharts.kotlin.properties

import kotlinext.js.Object
import recharts.util.types.AxisLabel
import recharts.util.types.BaseAxisProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisLabelOrNullProp : ReadWriteProperty<BaseAxisProps, AxisLabel?> {
    override fun getValue(thisRef: BaseAxisProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Number -> AxisLabel.Number(value as Number)
            is Object -> AxisLabel.Object(value as Object)
            //is ReactElement -> AxisLabel.ReactElement(value as ReactElement)
            is String -> AxisLabel.String(value as String)
            else -> null
        }

    override fun setValue(thisRef: BaseAxisProps, property: KProperty<*>, value: AxisLabel?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AxisLabel.Number -> value.value
            is AxisLabel.Object -> value.value
            is AxisLabel.ReactElement -> value.value
            is AxisLabel.String -> value.value
            null -> null
        }
    }
}
