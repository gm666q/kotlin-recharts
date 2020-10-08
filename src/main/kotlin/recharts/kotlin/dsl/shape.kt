package recharts.kotlin.dsl

import react.RBuilder
import react.RHandler
import recharts.shape.cross.Cross
import recharts.shape.curve.Curve
import recharts.shape.dot.Dot
import recharts.shape.polygon.Polygon
import recharts.shape.rectangle.Rectangle
import recharts.shape.sector.Sector
import recharts.shape.symbols.Symbols
import recharts.shape.trapezoid.Trapezoid
import recharts.shape.cross.Props as CrossProps
import recharts.shape.curve.Props as CurveProps
import recharts.shape.dot.Props as DotProps
import recharts.shape.polygon.Props as PolygonProps
import recharts.shape.rectangle.Props as RectangleProps
import recharts.shape.sector.Props as SectorProps
import recharts.shape.symbols.Props as SymbolsProps
import recharts.shape.trapezoid.Props as TrapezoidProps

fun RBuilder.cross(handler: RHandler<CrossProps>) = child(Cross::class) { handler.invoke(this) }

fun RBuilder.curve(handler: RHandler<CurveProps>) = child(Curve::class) { handler.invoke(this) }

fun RBuilder.dot(handler: RHandler<DotProps>) = child(Dot::class) { handler.invoke(this) }

fun RBuilder.polygon(handler: RHandler<PolygonProps>) = child(Polygon::class) { handler.invoke(this) }

fun RBuilder.rectangle(handler: RHandler<RectangleProps>) = child(Rectangle::class) { handler.invoke(this) }

fun RBuilder.sector(handler: RHandler<SectorProps>) = child(Sector::class) { handler.invoke(this) }

fun RBuilder.symbols(handler: RHandler<SymbolsProps>) = child(Symbols::class) { handler.invoke(this) }

fun RBuilder.trapezoid(handler: RHandler<TrapezoidProps>) = child(Trapezoid::class) { handler.invoke(this) }
