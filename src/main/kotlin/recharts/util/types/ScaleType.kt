package recharts.util.types

@Suppress("EnumEntryName")
enum class ScaleType {
    auto,
    band,
    identity,
    linear,
    log,

    //ordinal, // TODO: Fix
    point,
    pow,
    quantile,
    quantize,
    sequential,
    sqrt,
    threshold,
    time,
    utc
}
