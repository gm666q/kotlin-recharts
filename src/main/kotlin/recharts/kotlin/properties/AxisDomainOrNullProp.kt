package recharts.kotlin.properties

import recharts.util.types.AxisDomainItem
import recharts.util.types.BaseAxisProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisDomainOrNullProp : ReadWriteProperty<BaseAxisProps, Pair<AxisDomainItem, AxisDomainItem>?> {
    private fun getInnerValue(value: Any?) = when (value) {
        is Function<*> -> AxisDomainItem.Function(value)
        is Number -> AxisDomainItem.Number(value)
        is String -> try {
            AxisDomainItem.valueOf(value)
        } catch (e: IllegalArgumentException) {
            AxisDomainItem.String(value)
        }
        else -> throw NoWhenBranchMatchedException()
    }

    override fun getValue(thisRef: BaseAxisProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Array<*> -> if (value.size == 2) Pair(getInnerValue(value[0]), getInnerValue(value[1])) else null
            else -> null
        }

    private fun setInnerValue(value: AxisDomainItem) = when (value) {
        is AxisDomainItem.Function -> value.value
        is AxisDomainItem.Number -> value.value
        is AxisDomainItem.String -> value.value
        else -> value.name
    }

    override fun setValue(
        thisRef: BaseAxisProps,
        property: KProperty<*>,
        value: Pair<AxisDomainItem, AxisDomainItem>?
    ) {
        thisRef.asDynamic()[property.name] =
            if (value == null) null else arrayOf(setInnerValue(value.first), setInnerValue(value.second))
    }
}
