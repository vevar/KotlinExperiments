plugins {
    kotlin("multiplatform")
}

kotlin {
    js {
        browser()
    }


    dependencies {
        mppSetup {
            js = true

            mppLibrary(Deps.Multiplatform.kotlinStdlib)
            mppLibrary(Deps.Multiplatform.kotlinSerializationRuntime)
            mppLibrary(Deps.Multiplatform.coroutines)

            mppModule(Modules.App.FullStackJs.domain)
        }
    }
}