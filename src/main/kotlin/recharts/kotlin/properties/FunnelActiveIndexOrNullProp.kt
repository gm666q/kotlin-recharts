package recharts.kotlin.properties

import recharts.numberaxis.funnel.FunnelActiveIndex
import recharts.numberaxis.funnel.FunnelProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FunnelActiveIndexOrNullProp : ReadWriteProperty<FunnelProps, FunnelActiveIndex?> {
    override fun getValue(thisRef: FunnelProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Array<Number> -> FunnelActiveIndex.NumberArray(value as Array<Number>)
            is Number -> FunnelActiveIndex.Number(value as Number)
            else -> null
        }

    override fun setValue(thisRef: FunnelProps, property: KProperty<*>, value: FunnelActiveIndex?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is FunnelActiveIndex.Number -> value.value
            is FunnelActiveIndex.NumberArray -> value.value
            null -> null
        }
    }
}
