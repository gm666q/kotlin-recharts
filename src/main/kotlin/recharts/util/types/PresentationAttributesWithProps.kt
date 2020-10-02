package recharts.util.types

import react.AriaAttributes
import react.SVGProps

external interface PresentationAttributesWithProps<P, T> : AriaAttributes, DOMAttributesWithProps<P, T>, SVGProps<T>
