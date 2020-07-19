plugins {
    id("org.jetbrains.kotlin.js")
    id("kotlin-dce-js")
}



kotlin {

    target {
        nodejs { }
    }

    sourceSets {

    }
}
dependencies {
    implementation(kotlin("stdlib-js"))

    implementation(Deps.Js.Server.ktorServerCore)
    implementation("com.app.fullstack.js:domain-nodejs:0.0.1")
//    implementation(project(path = Modules.App.FullStackJs.feature))
}