package recharts.kotlin.properties

import recharts.kotlin.NumberOrString
import recharts.kotlin.RechartsProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class NullNumberOrStringProp : ReadWriteProperty<RechartsProps, NumberOrString?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>): NumberOrString? {
        return when (val value = thisRef.asDynamic()[property.name]) {
            is Number -> NumberOrString.Number(value as Number)
            is String -> NumberOrString.String(value as String)
            else -> null
        }
    }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: NumberOrString?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
        } else {
            when (value) {
                is NumberOrString.Number -> thisRef.asDynamic()[property.name] = value.value
                is NumberOrString.String -> thisRef.asDynamic()[property.name] = value.value
            }
        }
    }
}
