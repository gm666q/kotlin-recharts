@file:JsModule("recharts")
@file:JsNonModule

package recharts.shape.rectangle

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Rectangle")
external class Rectangle : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
