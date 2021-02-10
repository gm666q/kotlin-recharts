import org.jetbrains.dokka.gradle.DokkaTask

version = "2.0.6-1"

group = "space.gm666q"

kotlin {
    js {
        browser()
    }
    sourceSets {
        main {
            dependencies {
                api("org.jetbrains:kotlin-react:17.0.1-pre.144-kotlin-1.4.30")
                api("org.jetbrains:kotlin-react-dom:17.0.1-pre.144-kotlin-1.4.30")

                api(npm("recharts", "^2.0.6"))
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
    id("org.jetbrains.dokka") version "1.4.20"
    kotlin("js") version "1.4.30"
}

publishing {
    publications {
        create<MavenPublication>("kotlin") {
            artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))
            from(components["kotlin"])
            pom {
                ciManagement {
                    system.set("GitLab CI")
                    url.set("https://gitlab.com/gm666q/kotlin-recharts/-/pipelines")
                }
                description.set("Kotlin wrapper for Recharts library")
                developers {
                    developer {
                        email.set("gm666q@gm666q.space")
                        id.set("gm666q")
                        name.set("Jan Śmiałkowski")
                        timezone.set("Europe/London")
                        url.set("https://gm666q.space")
                    }
                }
                inceptionYear.set("2020")
                issueManagement {
                    system.set("GitLab")
                    url.set("https://gitlab.com/gm666q/kotlin-recharts/-/issues")
                }
                licenses {
                    license {
                        comments.set("A business-friendly OSS license")
                        distribution.set("repo")
                        name.set("Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                name.set("kotlin-recharts")
                scm {
                    connection.set("scm:git:https://gitlab.com/gm666q/kotlin-recharts.git")
                    developerConnection.set("scm:git:ssh://git@gitlab.com/gm666q/kotlin-recharts.git")
                    tag.set("v${project.version}")
                    url.set("https://gitlab.com/gm666q/kotlin-recharts")
                }
                url.set("https://gitlab.com/gm666q/kotlin-recharts")
            }
        }
    }
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

tasks {
    withType<DokkaTask>().configureEach {
        dokkaSourceSets {
            named("main") {
            }
        }
    }
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "6.8.2"
    }
}
