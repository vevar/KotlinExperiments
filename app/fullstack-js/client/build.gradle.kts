import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    id("org.jetbrains.kotlin.js")
    id("kotlin-dce-js")
}

//project.buildDir = File("../../../build/")


kotlin {

    target {
        useCommonJs()
        browser {
            webpackTask {
                //                devServer = KotlinWebpackConfig.DevServer(contentBase = listOf("${projectDir}/build/"))
//                buildDir = File("${projectDir}/src/main/web")

            }
            dceTask {
                dceOptions {
                    keep("ktor-ktor-io.\$\$importsForInline\$\$.ktor-ktor-io.io.ktor.utils.io")
                }
            }
        }
    }

    sourceSets {

    }
}
dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(path = Modules.App.FullStackJs.domain))
    implementation(project(path = Modules.App.FullStackJs.feature))
}