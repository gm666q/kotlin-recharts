package recharts.chart.treemap

import recharts.kotlin.Union

sealed class TreemapNestIndexContent(name: String, ordinal: Int) : Union<TreemapNestIndexContent>(name, ordinal) {
    data class Function(val value: (item: Any, i: Number) -> Any) : TreemapNestIndexContent("Function", 0)
    data class ReactElement(val value: react.ReactElement) : TreemapNestIndexContent("ReactElement", 1)

    companion object {
        fun valueOf(value: String): TreemapNestIndexContent {
            throw IllegalArgumentException()
        }

        fun values(): Array<TreemapNestIndexContent> = arrayOf()
    }
}
