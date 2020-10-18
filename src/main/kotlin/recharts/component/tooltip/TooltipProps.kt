package recharts.component.tooltip

import react.CSSProperties
import recharts.component.defaulttooltipcontent.NameType
import recharts.component.defaulttooltipcontent.ValueType
import recharts.kotlin.properties.EnumOrNullProp
import recharts.util.types.AnimationTiming
import recharts.component.defaulttooltipcontent.Props as DefaultProps

// TODO
external interface TooltipProps<TValue : ValueType, TName : NameType> : DefaultProps<TValue, TName> {
    var active: Boolean?

    /*allowEscapeViewBox?: {
        x?: boolean;
        y?: boolean;
    };*/
    var animationDuration: Number?
    var content: ContentType<TValue, TName>?

    /*coordinate?: {
    x?: number;
    y?: number;
    };*/
    /*cursor?:
    | boolean
    | ReactElement
    | {
        strokeDasharray: ReactText;
        stroke?: string;
      };*/
    var filterNull: Boolean?
    var isAnimationActive: Boolean?
    var offset: Number?
    var payloadUniqBy: UniqueOption<TValue, TName>

    /*position?: {
    x?: number;
    y?: number;
    };*/
    //trigger?: 'hover' | 'click';
    var useTranslate3d: Boolean?

    /*viewBox?: {
        x?: number;
        y?: number;
        width?: number;
        height?: number;
    };*/
    var wrapperStyle: CSSProperties?
}

var <TValue : ValueType, TName : NameType> TooltipProps<TValue, TName>.animationEasing by EnumOrNullProp(AnimationTiming::realValueOf)
