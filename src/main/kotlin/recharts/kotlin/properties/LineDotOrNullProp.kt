package recharts.kotlin.properties

import org.w3c.dom.svg.SVGElement
import recharts.cartesian.line.LineDot
import recharts.cartesian.line.LineProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LineDotOrNullProp : ReadWriteProperty<LineProps, LineDot?> {
    override fun getValue(thisRef: LineProps, property: KProperty<*>): LineDot? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> LineDot.Boolean(value as Boolean)
            //is DotProps -> LineDot.DotProps(value as DotProps)
            is (props: Any) -> SVGElement -> LineDot.Function(value as (props: Any) -> SVGElement)
            //is ReactElement/*<SVGElement>*/ -> LineDot.ReactElement(value as ReactElement/*<SVGElement>*/)
            else -> null
        }

    override fun setValue(thisRef: LineProps, property: KProperty<*>, value: LineDot?) {
        thisRef.asDynamic()[property.name] = when (value) {
            is LineDot.Boolean -> value.value
            is LineDot.DotProps -> value.value
            is LineDot.Function -> value.value
            is LineDot.ReactElement -> value.value
            null -> null
        }
    }
}
