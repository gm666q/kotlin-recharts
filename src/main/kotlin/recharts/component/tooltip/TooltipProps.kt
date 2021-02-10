/*
 * Copyright 2020-2021 Jan Śmiałkowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
    //cursor?: boolean | ReactElement | SVGProps<SVGElement>;
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
