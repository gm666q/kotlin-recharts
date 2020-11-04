package recharts.shape.curve

import d3.shape.CurveFactory
import recharts.kotlin.Union

@Suppress("ClassName")
sealed class CurveType(name: String, ordinal: Int) : Union<CurveType>(name, ordinal) {
    data class CurveFactory(val value: d3.shape.CurveFactory) : CurveType("CurveFactory", 0)
    object basis : CurveType("basis", 1)
    object basisClosed : CurveType("basisClosed", 2)
    object basisOpen : CurveType("basisOpen", 3)
    object linear : CurveType("linear", 4)
    object linearClosed : CurveType("linearClosed", 5)
    object monotone : CurveType("monotone", 6)
    object monotoneX : CurveType("monotoneX", 7)
    object monotoneY : CurveType("monotoneY", 8)
    object natural : CurveType("natural", 9)
    object step : CurveType("step", 10)
    object stepAfter : CurveType("stepAfter", 11)
    object stepBefore : CurveType("stepBefore", 12)

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

fun CurveFactory.toCurveType() = CurveType.CurveFactory(this)
