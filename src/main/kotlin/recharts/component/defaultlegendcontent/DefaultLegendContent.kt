@file:JsModule("recharts")
@file:JsNonModule

package recharts.component.defaultlegendcontent

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("DefaultLegendContent")
external class DefaultLegendContent<TValue, TID> : PureComponent<Props<TValue, TID>, RState> {
    override fun render(): ReactElement?
}
