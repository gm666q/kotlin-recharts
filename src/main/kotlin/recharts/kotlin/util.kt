package recharts.kotlin

import kotlinext.js.jsObject
import recharts.component.defaulttooltipcontent.DefaultTooltipContent
import recharts.util.types.Margin
import recharts.util.types.Padding

fun createMargin(_bottom: Number? = null, _left: Number? = null, _right: Number? = null, _top: Number? = null): Margin =
    jsObject { bottom = _bottom; left = _left; right = _right; top = _top }

fun createPadding(
    _bottom: Number? = null,
    _left: Number? = null,
    _right: Number? = null,
    _top: Number? = null
): Padding = jsObject { bottom = _bottom;left = _left;right = _right;top = _top }
