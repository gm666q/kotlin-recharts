package recharts.component.legend

import react.CSSProperties
import recharts.component.defaultlegendcontent.Props as DefaultProps

// TODO
external interface Props<TValue, TID> : DefaultProps<TValue, TID> {
    var chartHeight: Number?
    var chartWidth: Number?
    var height: Number?

    /*margin?: {
        top?: number;
        left ?: number;
        bottom ?: number;
        right?: number;
    };*/
    //onBBoxUpdate?: (box: ClientRect | DOMRect | null) => void;
    var payloadUniqBy: UniqueOption<TValue, TID>?
    var width: Number?
    var wrapperStyle: CSSProperties?
}
