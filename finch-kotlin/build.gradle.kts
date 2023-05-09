plugins {
    id("finch.kotlin")
    id("finch.publish")
}

dependencies {
    api(project(":finch-kotlin-client-okhttp"))
}
