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
        thisRef.asDynamic()[property.name] = when (value) {
            is DataKey.Function -> value.value
            is DataKey.Number -> value.value
            is DataKey.String -> value.value
            null -> null
        }
    }
}
