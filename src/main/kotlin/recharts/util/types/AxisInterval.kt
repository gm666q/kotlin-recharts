package recharts.util.types

import recharts.kotlin.Union

// TODO
sealed class AxisInterval(name: String, ordinal: Int) : Union<AxisInterval>(name, ordinal)
