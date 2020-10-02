package recharts.util.types

import react.AriaAttributes
import react.DOMAttributes
import react.SVGProps

external interface PresentationAttributes<T> : AriaAttributes, DOMAttributes<T>, SVGProps<T>
