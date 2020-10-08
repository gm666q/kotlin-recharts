@file:JsModule("recharts")
@file:JsNonModule

package recharts.component.defaulttooltipcontent

import react.PureComponent
import react.RState
import react.ReactElement

@JsName("DefaultTooltipContent")
external class DefaultTooltipContent<TValue : ValueType, TName : NameType> :
    PureComponent<Props<TValue, TName>, RState> {
    override fun render(): ReactElement?
}
