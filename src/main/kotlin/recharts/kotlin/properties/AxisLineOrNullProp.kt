package recharts.kotlin.properties

import recharts.util.types.AxisLine
import recharts.util.types.BaseAxisProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisLineOrNullProp : ReadWriteProperty<BaseAxisProps, AxisLine?> {
    override fun getValue(thisRef: BaseAxisProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> AxisLine.Boolean(value as Boolean)
            //is PresentationAttributes<SVGLineElement> -> AxisLine.PresentationAttributes(value as PresentationAttributes<SVGLineElement>)
            else -> null
        }

    override fun setValue(thisRef: BaseAxisProps, property: KProperty<*>, value: AxisLine?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AxisLine.Boolean -> value.value
            is AxisLine.PresentationAttributes -> value.value
            null -> null
        }
    }
}