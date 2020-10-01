package d3.shape

external interface CurveGenerator : CurveGeneratorLineOnly {
    fun areaEnd()
    fun areaStart()
}

external interface CurveGeneratorLineOnly {
    fun lineEnd()
    fun lineStart()
    fun point(x: Number, y: Number)
}

// TODO: Finish?
typealias CurveFactory = (context: dynamic) -> CurveGenerator