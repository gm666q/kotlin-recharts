@file:JsModule("recharts")
@file:JsNonModule

package recharts.cartesian.area

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Area")
external class Area : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
