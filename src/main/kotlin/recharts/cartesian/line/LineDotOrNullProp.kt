package recharts.cartesian.line

import org.w3c.dom.svg.SVGElement
import react.RProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LineDotOrNullProp : ReadWriteProperty<RProps, LineDot?> {
    override fun getValue(thisRef: RProps, property: KProperty<*>): LineDot? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> LineDot.Boolean(value as Boolean)
            //is DotProps -> LineDot.DotProps(value as DotProps)
            is (props: Any) -> SVGElement -> LineDot.Function(value as (props: Any) -> SVGElement)
            //is ReactElement/*<SVGElement>*/ -> LineDot.ReactElement(value as ReactElement/*<SVGElement>*/)
            else -> null
        }

    override fun setValue(thisRef: RProps, property: KProperty<*>, value: LineDot?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
        } else {
            when (value) {
                is LineDot.Boolean -> thisRef.asDynamic()[property.name] = value.value
                is LineDot.DotProps -> thisRef.asDynamic()[property.name] = value.value
                is LineDot.Function -> thisRef.asDynamic()[property.name] = value.value
                is LineDot.ReactElement -> thisRef.asDynamic()[property.name] = value.value
            }
        }
    }
}
