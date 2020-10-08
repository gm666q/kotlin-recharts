[![Kotlin](https://img.shields.io/badge/kotlin-1.4.10-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Gitlab pipeline status](https://img.shields.io/gitlab/pipeline/gm666q/kotlin-recharts/master?logo=gitlab)](https://gitlab.com/gm666q/kotlin-recharts/-/pipelines)
[![Gitlab code coverage](https://img.shields.io/gitlab/coverage/gm666q/kotlin-recharts/master?logo=gitlab)](https://gitlab.com/gm666q/kotlin-recharts/-/pipelines)
[![Maven metadata URL](https://img.shields.io/maven-metadata/v?label=gitlab&logo=gitlab&metadataUrl=https%3A%2F%2Fgitlab.com%2Fapi%2Fv4%2Fprojects%2F21457223%2Fpackages%2Fmaven%2Fspace%2Fgm666q%2Fkotlin-recharts%2Fmaven-metadata.xml)](https://gitlab.com/gm666q/kotlin-recharts/-/packages)
[![Bintray](https://img.shields.io/bintray/v/gm666q/kotlin-recharts/kotlin-recharts?logo=jfrog-bintray)](https://bintray.com/gm666q/kotlin-recharts/kotlin-recharts)

# kotlin-recharts

Kotlin wrapper for [Recharts](http://recharts.org) library.

This project is WIP.

## Installation

Groovy DSL

```groovy
repositories {
    maven { url 'https://gitlab.com/api/v4/projects/21457223/packages/maven' }
}

dependencies {
    implementation "space.gm666q:kotlin-recharts:${version}"
}
```

Kotlin DSL

```kotlin
repositories {
    maven("https://gitlab.com/api/v4/projects/21457223/packages/maven")
}

dependencies {
    implementation("space.gm666q:kotlin-recharts:${version}")
}
```

## Example

```kotlin
data class Data(val amt: Int, val name: String, val pv: Int, val uv: Int)

val d = arrayOf<Any>(
    Data(2400, "Page A", 2400, 400),
    Data(2400, "Page B", 4567, 300),
    Data(2400, "Page C", 1398, 300),
    Data(2400, "Page D", 9800, 200),
    Data(2400, "Page E", 3908, 278),
    Data(2400, "Page F", 4800, 189)
)

fun main() {
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
                    dataKey = DataKey.String(Data::uv.name)
                    type = CurveType.monotone
                }
                attrs.asDynamic()["stroke"] = "#8884d8"
            }
            xAxis {
                attrs {
                    dataKey = DataKey.String(Data::name.name)
                }
            }
            yAxis {
            }
        }
    }
}
```
