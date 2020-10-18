package recharts.kotlin.properties

import recharts.component.label.LabelProps
import recharts.component.label.LabelViewBox
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LabelViewBoxOrNullProp : ReadWriteProperty<LabelProps, LabelViewBox?> {
    override fun getValue(thisRef: LabelProps, property: KProperty<*>): LabelViewBox? =
        when (val value = thisRef.asDynamic()[property.name]) {
            //is CartesianViewBox -> LabelViewBox.CartesianViewBox(value as CartesianViewBox)
            //is PolarViewBox -> LabelViewBox.CartesianViewBox(value as PolarViewBox)
            else -> null
        }

    override fun setValue(thisRef: LabelProps, property: KProperty<*>, value: LabelViewBox?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is LabelViewBox.CartesianViewBox -> value.value
            is LabelViewBox.PolarViewBox -> value.value
            null -> null
        }
    }
}
