package recharts.kotlin.properties

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class EnumOrNullProp<T : Enum<T>>(private val valueOf: (value: String) -> T) : ReadWriteProperty<Any, T?> {
    override fun getValue(thisRef: Any, property: KProperty<*>): T? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is String -> try {
                valueOf(value as String)
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
        thisRef.asDynamic()[property.name] = value?.name
    }
}
