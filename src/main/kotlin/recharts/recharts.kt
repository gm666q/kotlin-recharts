package recharts

import react.RProps

external interface RechartsProps : RProps

operator fun RechartsProps.get(name: String) = asDynamic()[name]
operator fun RechartsProps.set(name: String, value: dynamic) {
    asDynamic()[name] = value
}
