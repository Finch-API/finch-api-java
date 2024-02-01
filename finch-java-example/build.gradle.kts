plugins {
    id("application")
    id("finch.java")
}

dependencies {
    implementation(project(":finch-java"))
}

application {
    mainClass.set("com.tryfinch.api.example.Main")
}
