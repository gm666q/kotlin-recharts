package recharts.shape.curve

import d3.shape.CurveFactory
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class CurveTypeProp : ReadWriteProperty<CurvePropsBase, CurveType?> {
    override fun getValue(thisRef: CurvePropsBase, property: KProperty<*>): CurveType? {
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

    override fun setValue(thisRef: CurvePropsBase, property: KProperty<*>, value: CurveType?) {
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
