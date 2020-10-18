package recharts.kotlin.properties

import recharts.kotlin.NumberOrString
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class NumberOrStringOrNullProp : ReadWriteProperty<Any, NumberOrString?> {
    override fun getValue(thisRef: Any, property: KProperty<*>): NumberOrString? {
        return when (val value = thisRef.asDynamic()[property.name]) {
            is Number -> NumberOrString.Number(value as Number)
            is String -> NumberOrString.String(value as String)
            else -> null
        }
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: NumberOrString?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is NumberOrString.Number -> value.value
            is NumberOrString.String -> value.value
            null -> null
        }
    }
}
