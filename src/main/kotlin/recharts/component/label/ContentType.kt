package recharts.component.label

import recharts.kotlin.Union

// TODO
sealed class ContentType(name: String, ordinal: Int) : Union<ContentType>(name, ordinal) {
    //data class Function(val value: (props: Props) -> ReactNode) : ContentType("Function", 0)
    data class ReactElement(val value: react.ReactElement) : ContentType("ReactElement", 1)

    companion object {
        fun valueOf(value: String): ContentType {
            throw IllegalArgumentException()
        }

        fun values(): Array<ContentType> = arrayOf()
    }
}
