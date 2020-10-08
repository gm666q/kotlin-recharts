@file:JsModule("recharts")
@file:JsNonModule

package recharts.polar.pie

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("Pie")
external class Pie : PureComponent<Props, RState> {
    override fun render(): ReactElement?
}
