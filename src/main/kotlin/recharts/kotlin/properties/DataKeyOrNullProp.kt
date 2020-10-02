package recharts.kotlin.properties

import recharts.kotlin.RechartsProps
import recharts.util.types.DataKey
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DataKeyOrNullProp<T> : ReadWriteProperty<RechartsProps, DataKey<T>?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>): DataKey<T>? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is (obj: T) -> Any -> DataKey.Function(value as (obj: T) -> Any)
            is Number -> DataKey.Number(value as Number)
            is String -> DataKey.String(value as String)
            else -> null
        }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: DataKey<T>?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
        } else {
            when (value) {
                is DataKey.Function -> thisRef.asDynamic()[property.name] = value.value
                is DataKey.Number -> thisRef.asDynamic()[property.name] = value.value
                is DataKey.String -> thisRef.asDynamic()[property.name] = value.value
            }
        }
    }
}
