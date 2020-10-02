package recharts.kotlin.properties

import d3.shape.CurveFactory
import recharts.kotlin.RechartsProps
import recharts.shape.curve.CurveProps
import recharts.shape.curve.CurveType
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class CurveTypeOrNullProp : ReadWriteProperty<RechartsProps, CurveType?> {
    override fun getValue(thisRef: RechartsProps, property: KProperty<*>): CurveType? {
        return when (val value = thisRef.asDynamic()[property.name]) {
            is CurveFactory -> {
                CurveType.CurveFactory(value as CurveFactory)
            }
            is String -> try {
                CurveType.valueOf(value as String)
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }
    }

    override fun setValue(thisRef: RechartsProps, property: KProperty<*>, value: CurveType?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
        } else {
            when (value) {
                is CurveType.CurveFactory -> thisRef.asDynamic()[property.name] = value.value
                else -> thisRef.asDynamic()[property.name] = value.toString()
            }
        }
    }
}
