package recharts.component.label

import recharts.kotlin.Union

// TODO
sealed class LabelContentType(name: String, ordinal: Int) : Union<LabelContentType>(name, ordinal) {
    //data class Function(val value: (props: Props) -> ReactNode) : LabelContentType("Function", 0)
    data class ReactElement(val value: react.ReactElement) : LabelContentType("ReactElement", 1)

    companion object {
        fun valueOf(value: String): LabelContentType {
            throw IllegalArgumentException()
        }

        fun values(): Array<LabelContentType> = arrayOf()
    }
}
