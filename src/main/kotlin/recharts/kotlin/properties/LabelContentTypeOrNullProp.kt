package recharts.kotlin.properties

import recharts.component.label.ContentType
import recharts.component.label.LabelProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LabelContentTypeOrNullProp : ReadWriteProperty<LabelProps, ContentType?> {
    override fun getValue(thisRef: LabelProps, property: KProperty<*>): ContentType? =
        when (val value = thisRef.asDynamic()[property.name]) {
            //is (props: Props) -> ReactNode -> LabelContentType.Function(value as (props: Props) -> ReactNode)
            //is ReactElement -> LabelContentType.ReactElement(value as ReactElement)
            else -> null
        }

    override fun setValue(thisRef: LabelProps, property: KProperty<*>, value: ContentType?) {
        thisRef.asDynamic()[property.name] = when (value) {
            //is LabelContentType.Function -> value.value
            is ContentType.ReactElement -> value.value
            null -> null
        }
    }
}
