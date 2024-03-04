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
                name.set("API Reference")
                description.set("The Finch HRIS API provides a unified way to connect to a multitide of HRIS\nsystems. The API requires an access token issued by Finch.\n\nBy default, Organization and Payroll requests use Finch's\n[Data Syncs](/development-guides/Data-Syncs). If a request is made before the\ninitial sync has completed, Finch will request data live from the provider. The\nlatency on live requests may range from seconds to minutes depending on the\nprovider and batch size. For automated integrations, Deductions requests (both\nread and write) are always made live to the provider. Latencies may range from\nseconds to minutes depending on the provider and batch size.\n\nEmployer products are specified by the product parameter, a space-separated list\nof products that your application requests from an employer authenticating\nthrough Finch Connect. Valid product names are—\n\n- `company`: Read basic company data\n\n- `directory`: Read company directory and organization structure\n\n- `individual`: Read individual data, excluding income and employment data\n\n- `employment`: Read individual employment and income data\n\n- `payment`: Read payroll and contractor related payments by the company\n\n- `pay_statement`: Read detailed pay statements for each individual\n\n- `benefits`: Create and manage deductions and contributions and enrollment for\n  an employer\n\n[![Open in Postman](https://run.pstmn.io/button.svg)](https://god.gw.postman.com/run-collection/21027137-08db0929-883d-4094-a9ce-dbf5a9bee4a4?action=collection%2Ffork&collection-url=entityId%3D21027137-08db0929-883d-4094-a9ce-dbf5a9bee4a4%26entityType%3Dcollection%26workspaceId%3D1edf19bc-e0a8-41e9-ac55-481a4b50790b)")
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
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
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
