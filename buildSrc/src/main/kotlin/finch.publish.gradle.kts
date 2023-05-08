import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get

plugins {
    `maven-publish`
    `signing`
}

configure<PublishingExtension> {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("ATS API Reference")
                description.set("The Finch ATS (Applicant Tracking System) API provides a unified way to connect\nto a multitude of ATS providers. The API requires an access token issued by\nFinch.\n\nTo enable access to the ATS API, please reach out to your Finch representative.\n\nATS products are specified by the product parameter, a space-separated list of\nproducts that your application requests from an employer authenticating through\nFinch Connect. Valid product names are—\n\n- `candidates`: Read candidate data\n- `applications`: Read detailed application data for candidates\n- `jobs`: Read job posting data, as well as existing stages of the job pipeline\n- `offers`: Read details about offers managed through the ATS")
                url.set("https://developer.tryfinch.com/")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Finch")
                        email.set("founders@tryfinch.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/Finch-API/finch-api-java.git")
                    developerConnection.set("scm:git:git://github.com/Finch-API/finch-api-java.git")
                    url.set("https://github.com/Finch-API/finch-api-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")
    val signingKey = System.getenv("GPG_SIGNING_KEY")
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.publish {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
