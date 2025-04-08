plugins {
    id("finch.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":finch-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.tryfinch.api.example.Main"
}
