package recharts.kotlin.properties

import recharts.component.label.LabelProps
import recharts.component.label.ViewBox
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LabelViewBoxOrNullProp : ReadWriteProperty<LabelProps, ViewBox?> {
    override fun getValue(thisRef: LabelProps, property: KProperty<*>): ViewBox? =
        when (val value = thisRef.asDynamic()[property.name]) {
            //is CartesianViewBox -> ViewBox.CartesianViewBox(value as CartesianViewBox)
            //is PolarViewBox -> ViewBox.CartesianViewBox(value as PolarViewBox)
            else -> null
        }

    override fun setValue(thisRef: LabelProps, property: KProperty<*>, value: ViewBox?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is ViewBox.CartesianViewBox -> value.value
            is ViewBox.PolarViewBox -> value.value
            null -> null
        }
    }
}
