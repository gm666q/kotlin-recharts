package recharts.kotlin.properties

import d3.shape.CurveFactory
import recharts.kotlin.RechartsProps
import recharts.shape.curve.CurveType
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class CurveTypeOrNullProp : ReadWriteProperty<RechartsProps, CurveType?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>): CurveType? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is CurveFactory -> CurveType.CurveFactory(value as CurveFactory)
            is String -> try {
                CurveType.valueOf(value as String)
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: CurveType?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is CurveType.CurveFactory -> value.value
            null -> null
            else -> value.name
        }
    }
}
