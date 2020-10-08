@file:JsModule("recharts")
@file:JsNonModule

package recharts.component.tooltip

import react.PureComponent
import react.RState
import react.ReactElement
import recharts.component.defaulttooltipcontent.NameType
import recharts.component.defaulttooltipcontent.ValueType

@JsName("Tooltip")
external class Tooltip<TValue : ValueType, TName : NameType> : PureComponent<TooltipProps<TValue, TName>, RState> {
    override fun render(): ReactElement?
}
