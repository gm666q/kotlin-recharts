package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import react.child
import recharts.container.layer.Layer
import recharts.container.surface.Surface
import recharts.container.layer.Props as LayerProps
import recharts.container.surface.Props as SurfaceProps

fun RBuilder.layer(handler: RHandler<LayerProps>) = child(Layer) { handler.invoke(this) }

fun RBuilder.surface(handler: RHandler<SurfaceProps>) = child(Surface) { handler.invoke(this) }
