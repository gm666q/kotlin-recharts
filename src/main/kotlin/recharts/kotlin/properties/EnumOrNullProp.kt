package recharts.kotlin.properties

import recharts.kotlin.RechartsProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class EnumOrNullProp<T : Enum<T>>(private val valueOf: (value: String) -> T) : ReadWriteProperty<RechartsProps, T?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>): T? {
        val value = thisRef.asDynamic()[property.name]
        return if (value is String) {
            try {
                valueOf(value as String)
            } catch (e: IllegalArgumentException) {
                null
            }
        } else {
            null
        }
    }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: T?) {
        thisRef.asDynamic()[property.name] = value?.toString()
    }
}
