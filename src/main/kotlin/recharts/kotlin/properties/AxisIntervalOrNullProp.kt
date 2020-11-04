package recharts.kotlin.properties

import recharts.util.types.AxisInterval
import recharts.util.types.BaseAxisProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisIntervalOrNullProp : ReadWriteProperty<BaseAxisProps, AxisInterval?> {
    override fun getValue(thisRef: BaseAxisProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Number -> AxisInterval.Number(value as Number)
            is String -> try {
                AxisInterval.valueOf(value as String)
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: BaseAxisProps, property: KProperty<*>, value: AxisInterval?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AxisInterval.Number -> value.value
            null -> null
            else -> value.name
        }
    }
}