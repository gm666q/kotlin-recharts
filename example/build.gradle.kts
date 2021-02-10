group = "space.gm666q"

kotlin {
    js(LEGACY) {
        browser {
            binaries.executable()
            runTask {
                cssSupport.enabled = true
            }
            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
            webpackTask {
                cssSupport.enabled = true
            }
        }
    }
    sourceSets {
        main {
            dependencies {
                implementation("org.jetbrains:kotlin-react:17.0.1-pre.144-kotlin-1.4.30")
                implementation("org.jetbrains:kotlin-react-dom:17.0.1-pre.144-kotlin-1.4.30")
                implementation("org.jetbrains:kotlin-styled:5.2.0-pre.144-kotlin-1.4.30")
                implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.2")
                implementation("space.gm666q:kotlin-recharts:2.0.6-1")
            }
        }
        test {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

plugins {
    kotlin("js") version "1.4.30"
}

repositories {
    jcenter()
    maven {
        name = "GitLab"
        url = uri("https://gitlab.com/api/v4/projects/21457223/packages/maven")
    }
    mavenCentral()
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "6.8.2"
}

version = "0.0.1"
