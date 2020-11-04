package recharts.kotlin.properties

import recharts.cartesian.area.AreaBaseValue
import recharts.cartesian.area.AreaProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AreaBaseValueOrNullProp : ReadWriteProperty<AreaProps, AreaBaseValue?> {
    override fun getValue(thisRef: AreaProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Number -> AreaBaseValue.Number(value as Number)
            is String -> try {
                AreaBaseValue.valueOf(value as String)
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: AreaProps, property: KProperty<*>, value: AreaBaseValue?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AreaBaseValue.Number -> value.value
            null -> null
            else -> value.name
        }
    }
}
