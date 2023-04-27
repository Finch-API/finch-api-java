plugins {
    id("finch.kotlin")
    id("finch.publish")
}

dependencies {
    api(project(":finch-java-client-okhttp"))
}
