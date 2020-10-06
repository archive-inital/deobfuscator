import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version Project.kotlinVersion
}

tasks.withType<Wrapper> {
    gradleVersion = Project.gradleVersion
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "org.spectral"
    version = Project.version

    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven { url = uri("https://repo.spectralclient.org/repository/spectral") }
    }

    dependencies {
        implementation(kotlin("stdlib"))
        logger()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = Project.jvmVersion
    }
}
