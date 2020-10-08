package recharts.component.label

import recharts.kotlin.RechartsProps
import recharts.kotlin.properties.NullNumberOrStringProp

// TOOO
external interface LabelProps : RechartsProps {
    //children?: ReactNode;
    var className: String?
    //content?: ContentType;
    var formatter: Function<*>? //Function
    var offset: Number?
    /*position?:
    | 'top'
    | 'left'
    | 'right'
    | 'bottom'
    | 'inside'
    | 'outside'
    | 'insideLeft'
    | 'insideRight'
    | 'insideTop'
    | 'insideBottom'
    | 'insideTopLeft'
    | 'insideBottomLeft'
    | 'insideTopRight'
    | 'insideBottomRight'
    | 'insideStart'
    | 'insideEnd'
    | 'end'
    | 'center'
    | 'centerTop'
    | 'centerBottom'
    | {
        x?: number;
        y?: number;
      };*/
    //viewBox?: ViewBox;
}

var LabelProps.value by NullNumberOrStringProp()
