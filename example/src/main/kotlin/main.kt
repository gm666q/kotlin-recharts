import kotlinx.browser.document
import kotlinx.browser.window
import react.dom.render
import recharts.cartesian.line.dataKey
import recharts.cartesian.line.type
import recharts.kotlin.createMargin
import recharts.kotlin.dsl.*
import recharts.shape.curve.CurveType
import recharts.util.types.dataKey
import recharts.util.types.toDataKey

val d = arrayOf<Any>(
    Data(2400, "Page A", 2400, 400),
    Data(2400, "Page B", 4567, 300),
    Data(2400, "Page C", 1398, 300),
    Data(2400, "Page D", 9800, 200),
    Data(2400, "Page E", 3908, 278),
    Data(2400, "Page F", 4800, 189)
)

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            lineChart {
                attrs {
                    data = d
                    height = 300
                    margin = createMargin(5, 0, 20, 5)
                    width = 600
                }
                cartesianGrid {
                    attrs.asDynamic()["stroke"] = "#ccc"
                    attrs.asDynamic()["strokeDasharray"] = "5 5"
                }
                line {
                    attrs {
                        dataKey = Data::uv.name.toDataKey()
                        type = CurveType.monotone
                    }
                    attrs.asDynamic()["stroke"] = "#8884d8"
                }
                xAxis {
                    attrs {
                        dataKey = Data::name.name.toDataKey()
                    }
                }
                yAxis {
                }
                tooltip {
                }
            }
        }
    }
}
