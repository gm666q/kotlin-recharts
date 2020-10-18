package recharts.kotlin.properties

import recharts.component.label.LabelContentType
import recharts.component.label.LabelProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LabelContentTypeOrNullProp : ReadWriteProperty<LabelProps, LabelContentType?> {
    override fun getValue(thisRef: LabelProps, property: KProperty<*>): LabelContentType? =
        when (val value = thisRef.asDynamic()[property.name]) {
            //is (props: Props) -> ReactNode -> LabelContentType.Function(value as (props: Props) -> ReactNode)
            //is ReactElement -> LabelContentType.ReactElement(value as ReactElement)
            else -> null
        }

    override fun setValue(thisRef: LabelProps, property: KProperty<*>, value: LabelContentType?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is LabelContentType.Function -> value.value
            is LabelContentType.ReactElement -> value.value
            null -> null
        }
    }
}
