package recharts.kotlin.properties

import recharts.chart.treemap.Props
import recharts.chart.treemap.TreemapNestIndexContent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class TreemapNestIndexContentOrNullProp : ReadWriteProperty<Props, TreemapNestIndexContent?> {
    override fun getValue(thisRef: Props, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is (item: Any, i: Number) -> Any -> TreemapNestIndexContent.Function(value as (item: Any, i: Number) -> Any)
            //is ReactElement -> NestIndexContent.ReactElement(value as ReactElement)
            else -> null
        }

    override fun setValue(thisRef: Props, property: KProperty<*>, value: TreemapNestIndexContent?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is TreemapNestIndexContent.Function -> value.value
            is TreemapNestIndexContent.ReactElement -> value.value
            null -> null
        }
    }
}
