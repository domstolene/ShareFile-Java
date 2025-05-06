plugins {
    `java-library`
    // Apply the java-library plugin for API and implementation separation.
    `maven-publish`
}

val GITHUB_USER: String by project
val GITHUB_TOKEN: String by project
version = "3.1.7"
group = "com.citrix"

repositories {
    mavenCentral()
}

sourceSets {
    main {
        java {
            srcDir("src")
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("org.apache.httpcomponents:httpcore:4.4.13")
    implementation("org.apache.directory.studio:org.apache.commons.codec:1.6")
    implementation("com.google.code.gson:gson:2.13.1")
}

publishing {

    repositories {
        maven {
            name = "sharefile-api-patched"
            url = uri("https://maven.pkg.github.com/domstolene/ShareFile-Java")
            credentials {
                username = GITHUB_USER
                password = GITHUB_TOKEN
            }
        }
    }

    publications {
        create<MavenPublication>("maven") {
            groupId = "com.citrix"
            artifactId = "sharefile-api-patched"

            from(components["java"])
            pom {
                licenses {
                    license {
                        name.set("The MIT License (MIT)")
                        url.set("https://github.com/citrix/ShareFile-Java/blob/master/LICENSE.txt")
                    }
                }
                developers {
                    developer {
                        id.set("nileshp")
                        name.set("Nilesh Pawar")
                        email.set("nilesh.pawar@citrix.com")
                    }
                }
            }
        }
    }
}