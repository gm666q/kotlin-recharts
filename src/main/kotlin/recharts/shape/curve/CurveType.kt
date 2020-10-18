package recharts.shape.curve

import recharts.kotlin.Union

@Suppress("ClassName")
sealed class CurveType(name: String, ordinal: Int) : Union<CurveType>(name, ordinal) {
    object basis : CurveType("basis", 0)
    object basisClosed : CurveType("basisClosed", 1)
    object basisOpen : CurveType("basisOpen", 2)
    object linear : CurveType("linear", 3)
    object linearClosed : CurveType("linearClosed", 4)
    object monotone : CurveType("monotone", 5)
    object monotoneX : CurveType("monotoneX", 6)
    object monotoneY : CurveType("monotoneY", 7)
    object natural : CurveType("natural", 8)
    object step : CurveType("step", 9)
    object stepAfter : CurveType("stepAfter", 10)
    object stepBefore : CurveType("stepBefore", 11)
    data class CurveFactory(val value: d3.shape.CurveFactory) : CurveType("CurveFactory", 12)

    companion object {
        fun valueOf(value: String): CurveType = when (value) {
            basis.name -> basis
            basisClosed.name -> basisClosed
            basisOpen.name -> basisOpen
            linear.name -> linear
            linearClosed.name -> linearClosed
            monotone.name -> monotone
            monotoneX.name -> monotoneX
            monotoneY.name -> monotoneY
            natural.name -> natural
            step.name -> step
            stepAfter.name -> stepAfter
            stepBefore.name -> stepBefore
            else -> throw IllegalArgumentException()
        }

        fun values(): Array<CurveType> = arrayOf(
            basis,
            basisClosed,
            basisOpen,
            linear,
            linearClosed,
            monotone,
            monotoneX,
            monotoneY,
            natural,
            step,
            stepAfter,
            stepBefore
        )
    }
}
