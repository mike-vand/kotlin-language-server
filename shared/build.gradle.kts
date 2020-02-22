plugins {
    kotlin("jvm")
    maven
}

version = BuildConstants.projectVersion

// sourceCompatibility = 1.8
// targetCompatibility = 1.8

repositories {
    maven(url = "https://repo.gradle.org/gradle/libs-releases")
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
	testImplementation("junit:junit:4.11")
}
