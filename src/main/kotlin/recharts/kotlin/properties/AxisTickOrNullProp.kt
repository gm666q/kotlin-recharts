package recharts.kotlin.properties

import org.w3c.dom.svg.SVGElement
import recharts.util.types.AxisTick
import recharts.util.types.BaseAxisProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AxisTickOrNullProp : ReadWriteProperty<BaseAxisProps, AxisTick?> {
    override fun getValue(thisRef: BaseAxisProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> AxisTick.Boolean(value as Boolean)
            is (props: Any) -> SVGElement -> AxisTick.Function(value as (props: Any) -> SVGElement)
            //is PresentationAttributes<SVGTextElement> -> AxisTick.PresentationAttributes(value as PresentationAttributes<SVGTextElement>)
            //is ReactElement -> AxisTick.ReactElement(value as ReactElement)
            else -> null
        }

    override fun setValue(thisRef: BaseAxisProps, property: KProperty<*>, value: AxisTick?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AxisTick.Boolean -> value.value
            is AxisTick.Function -> value.value
            is AxisTick.PresentationAttributes -> value.value
            is AxisTick.ReactElement -> value.value
            null -> null
        }
    }
}
