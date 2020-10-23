package recharts.kotlin.properties

import recharts.component.label.LabelPosition
import recharts.component.label.LabelProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LabelPositionOrNullProp : ReadWriteProperty<LabelProps, LabelPosition?> {
    override fun getValue(thisRef: LabelProps, property: KProperty<*>): LabelPosition? =
        when (val value = thisRef.asDynamic()[property.name]) {
            /*is LabelPositionObject -> {
                LabelPosition.Object(value as LabelPositionObject)
            }*/
            is String -> try {
                LabelPosition.valueOf(value as String)
            } catch (e: IllegalArgumentException) {
                null
            }
            else -> null
        }

    override fun setValue(thisRef: LabelProps, property: KProperty<*>, value: LabelPosition?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is LabelPosition.Object -> value.value
            null -> null
            else -> value.name
        }
    }
}
