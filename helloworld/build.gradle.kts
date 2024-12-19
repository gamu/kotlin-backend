plugins {
    kotlin("jvm")
    id("buildlogic.kotlin-application-conventions")
}

dependencies {
    testImplementation(libs.kotlin.test)
    testImplementation(libs.kotlin.test.junit5)
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

sourceSets {
    test {
        kotlin {
            srcDirs("src/test/kotlin")
        }
    }
}