package recharts.kotlin.properties

import recharts.kotlin.RechartsProps
import recharts.util.types.AxisScale
import recharts.util.types.ScaleType
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisScaleOrNullProp : ReadWriteProperty<RechartsProps, AxisScale?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Function<*> -> AxisScale.Function(value as Function<*>)
            is String -> try {
                AxisScale.ScaleType(ScaleType.valueOf(value as String))
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: AxisScale?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AxisScale.Function -> value.value
            is AxisScale.ScaleType -> value.value.name
            null -> null
        }
    }
}
