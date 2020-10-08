package recharts.component.customized

import recharts.kotlin.RechartsProps

external interface Props<P, C : Comp<P>> : RechartsProps {
    var component: C
}
