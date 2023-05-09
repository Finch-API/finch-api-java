plugins {
    id("finch.kotlin")
    id("finch.publish")
}

dependencies {
    api(project(":finch-kotlin-core"))

    implementation("com.google.guava:guava:31.1-jre")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation("org.slf4j:slf4j-simple:1.7.29")
}
