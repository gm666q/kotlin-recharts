package recharts.kotlin.properties

import org.w3c.dom.svg.SVGElement
import recharts.cartesian.cartesiangrid.CartesianGridProps
import recharts.cartesian.cartesiangrid.GridLineType
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class GridLineTypeOrNullProp : ReadWriteProperty<CartesianGridProps, GridLineType?> {
    override fun getValue(thisRef: CartesianGridProps, property: KProperty<*>): GridLineType? =
        when (val value = thisRef.asDynamic()[property.name]) {
            is Boolean -> GridLineType.Boolean(value as Boolean)
            is (props: Any) -> SVGElement -> GridLineType.Function(value as (props: Any) -> SVGElement)
            //is PresentationAttributes<SVGLineElement> -> GridLineType.PresentationAttributes(value as PresentationAttributes<SVGLineElement>)
            //is ReactElement/*<SVGElement>*/ -> GridLineType.ReactElement(value as ReactElement/*<SVGElement>*/)
            else -> null
        }

    override fun setValue(thisRef: CartesianGridProps, property: KProperty<*>, value: GridLineType?) {
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
        } else {
            when (value) {
                is GridLineType.Boolean -> thisRef.asDynamic()[property.name] = value.value
                is GridLineType.Function -> thisRef.asDynamic()[property.name] = value.value
                is GridLineType.PresentationAttributes -> thisRef.asDynamic()[property.name] = value.value
                is GridLineType.ReactElement -> thisRef.asDynamic()[property.name] = value.value
            }
        }
    }
}
