val GITHUB_USER: String by project
val GITHUB_TOKEN: String by project

plugins {
    `java-library`

    // Apply the java-library plugin for API and implementation separation.
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.httpcomponents:httpcore:4.3.2")
    implementation("org.apache.directory.studio:org.apache.commons.codec:1.6")
    implementation("com.google.code.gson:gson:2.7")
}

publishing {

    repositories {
        maven {
            name = "sharefile-api"
            url = uri("https://maven.pkg.github.com/domstolene/lovisa_core")
            credentials {
                username = GITHUB_USER
                password = GITHUB_TOKEN
            }
        }
    }

    publications {
        create<MavenPublication>("maven") {
            groupId = "no.domstolene"
            artifactId = "core_domain"

            from(components["java"])
            pom {
                licenses {
                    license {
                        name.set("The MIT License (MIT)")
                        url.set("https://github.com/citrix/ShareFile-Java/blob/master/LICENSE.txt")
                    }
                }
            }
        }
    }
}