import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "aminyaev"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm")
    id("application")
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation(Deps.Multiplatform.coroutines.jvm)
}


repositories {
    mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}