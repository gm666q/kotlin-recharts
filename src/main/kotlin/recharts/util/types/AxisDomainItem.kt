package recharts.util.types

import recharts.kotlin.Union

// TODO
sealed class AxisDomainItem(name: String, ordinal: Int) : Union<AxisDomainItem>(name, ordinal)
