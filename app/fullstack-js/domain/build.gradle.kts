plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

group = "com.app.fullstack.js"
version = "0.0.1"

kotlin {
    js {
        useCommonJs()
    }

    js("nodejs") {
        nodejs()
    }

    js("browser") {
        browser()
    }


    dependencies {
        mppSetup {
            js = true
            nodeJs = true
            browser = true

            mppLibrary(Deps.Multiplatform.kotlinStdlib)
            mppLibrary(Deps.Multiplatform.kotlinSerializationRuntime)
            mppLibrary(Deps.Multiplatform.coroutines)
        }
    }
}