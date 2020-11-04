package recharts.kotlin.properties

import react.RProps
import recharts.kotlin.NumberArrayOrStringArray
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class NumberArrayOrStringArrayOrNullProp : ReadWriteProperty<RProps, NumberArrayOrStringArray?> {
    override fun getValue(thisRef: RProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Array<Number> -> NumberArrayOrStringArray.NumberArray(value as Array<Number>)
            is Array<String> -> NumberArrayOrStringArray.StringArray(value as Array<String>)
            else -> null
        }

    override fun setValue(thisRef: RProps, property: KProperty<*>, value: NumberArrayOrStringArray?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is NumberArrayOrStringArray.NumberArray -> value.value
            is NumberArrayOrStringArray.StringArray -> value.value
            null -> null
        }
    }
}