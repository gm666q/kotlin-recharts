package recharts

import react.RProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class EnumOrNullProp<T : Enum<T>>(private val valueOf: (value: String) -> T) : ReadWriteProperty<RProps, T?> {
    override fun getValue(thisRef: RProps, property: KProperty<*>): T? {
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

    override fun setValue(thisRef: RProps, property: KProperty<*>, value: T?) {
        thisRef.asDynamic()[property.name] = value?.toString()
    }
}
