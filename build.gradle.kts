import org.jetbrains.dokka.gradle.DokkaTask

group = "space.gm666q"

kotlin {
    js {
        browser()
    }
    sourceSets {
        main {
            dependencies {
                api("org.jetbrains:kotlin-react:16.13.1-pre.120-kotlin-1.4.10")
                api("org.jetbrains:kotlin-react-dom:16.13.1-pre.120-kotlin-1.4.10")

                api(npm("recharts", "^2.0.0-beta.7"))
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
    id("org.gradle.maven-publish")
    id("org.jetbrains.dokka") version "1.4.10"
    kotlin("js") version "1.4.10"
}

publishing {
    repositories {
        maven {
            authentication {
                create<HttpHeaderAuthentication>("header")
            }
            credentials(HttpHeaderCredentials::class) {
                name = "Job-Token"
                value = System.getenv("CI_JOB_TOKEN")
            }
            name = "GitLab"
            url = uri("https://gitlab.com/api/v4/projects/21457223/packages/maven")
        }
    }
}

repositories {
    jcenter()
    mavenCentral()
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets {
        named("main") {
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "6.6.1"
}

version = "2.0.0-beta.7-1"
