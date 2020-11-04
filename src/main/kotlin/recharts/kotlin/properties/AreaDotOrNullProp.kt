package recharts.kotlin.properties

import org.w3c.dom.svg.SVGElement
import react.ReactElement
import recharts.cartesian.area.AreaDot
import recharts.cartesian.area.AreaProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AreaDotOrNullProp : ReadWriteProperty<AreaProps, AreaDot?> {
    override fun getValue(thisRef: AreaProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> AreaDot.Boolean(value as Boolean)
            //is Props -> AreaDot.DotProps(value as Props)
            //is ReactElement -> AreaDot.ReactElement(value as ReactElement)
            is (props: Any) -> ReactElement -> AreaDot.ReactElementFunction(value as (props: Any) -> ReactElement)
            is (props: Any) -> SVGElement -> AreaDot.SVGElementFunction(value as (props: Any) -> SVGElement)
            else -> null
        }

    override fun setValue(thisRef: AreaProps, property: KProperty<*>, value: AreaDot?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is AreaDot.Boolean -> value.value
            is AreaDot.DotProps -> value.value
            is AreaDot.ReactElement -> value.value
            is AreaDot.ReactElementFunction -> value.value
            is AreaDot.SVGElementFunction -> value.value
            null -> null
        }
    }
}
