@file:JsModule("recharts")
@file:JsNonModule

package recharts.component.legend

import react.PureComponent
import react.RState
import react.ReactElement
import recharts.component.defaulttooltipcontent.NameType
import recharts.component.defaulttooltipcontent.ValueType
import recharts.component.tooltip.TooltipProps

@JsName("Legend")
external class Legend<TValue, TID> : PureComponent<Props<TValue, TID>, RState> {
    override fun render(): ReactElement?
}
