package react

// TODO
external interface AriaAttributes

operator fun AriaAttributes.get(name: String) = asDynamic()[name]
operator fun AriaAttributes.set(name: String, value: dynamic) {
    asDynamic()[name] = value
}
