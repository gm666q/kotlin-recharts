package recharts.kotlin.properties

import org.w3c.dom.svg.SVGElement
import recharts.numberaxis.funnel.FunnelActiveShape
import recharts.numberaxis.funnel.FunnelProps
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FunnelActiveShapeProp : ReadWriteProperty<FunnelProps, FunnelActiveShape> {
    override fun getValue(thisRef: FunnelProps, property: KProperty<*>) =
        when (val value = thisRef.asDynamic()[property.name]) {
            is (props: Any) -> SVGElement -> FunnelActiveShape.Function(value as (props: Any) -> SVGElement)
            //is ReactElement -> FunnelActiveShape.ReactElement(value as ReactElement)
            //is TrapezoidProps -> FunnelActiveShape.TrapezoidProps(value as TrapezoidProps)
            else -> throw NoWhenBranchMatchedException()
        }

    override fun setValue(thisRef: FunnelProps, property: KProperty<*>, value: FunnelActiveShape) {
        thisRef.asDynamic()[property.name] = when (value) {
            is FunnelActiveShape.Function -> value.value
            is FunnelActiveShape.ReactElement -> value.value
            is FunnelActiveShape.TrapezoidProps -> value.value
        }
    }
}
