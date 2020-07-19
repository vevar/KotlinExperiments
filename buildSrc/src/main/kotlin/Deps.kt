object Deps {

    object Multiplatform {

        val kotlinStdlib = MultiplatformDeps(
            jvm = Jvm.kotlinStdlib,
            common = Common.kotlinStdlib,
            js = Js.kotlinStdlib
        )

        val coroutines = MultiplatformDeps(
            jvm = Jvm.coroutines,
            common = Common.coroutines,
            js = Js.coroutines
        )

        val ktorClient = MultiplatformDeps(
            js = "io.ktor:ktor-client-js:${Versions.Kotlin.ktor}"
        )

        val ktorServerCore = MultiplatformDeps(
            js = Js.Server.ktorServerCore
        )

        val ktorSerialization = MultiplatformDeps(
            js = "io.ktor:ktor-client-serialization-js:${Versions.Kotlin.ktor}"
        )
        val ktorJson = MultiplatformDeps(
            js = "io.ktor:ktor-client-json-js:${Versions.Kotlin.ktor}"
        )


        val kotlinSerialization =
            MultiplatformDeps(common = "org.jetbrains.kotlin:kotlin-serialization:${Versions.Kotlin.serialization}")

        val kotlinSerializationRuntime =
            MultiplatformDeps(
                jvm = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.Kotlin.serializationRuntime}",
                common = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.Kotlin.serializationRuntime}",
                js = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:${Versions.Kotlin.serializationRuntime}"
            )
    }

    object Js {
        val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-js:${Versions.Kotlin.kotlin}"


        object Server {
            const val ktorServerCore = "io.ktor:ktor-server-core:${Versions.Kotlin.ktor}"
        }

        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core-js:${Versions.Kotlin.coroutines}"

        object Frontend {
            const val kotlinReact = "org.jetbrains:kotlin-react:${Versions.Js.Frontend.kotlinReact}"
            const val kotlinReactDom = "org.jetbrains:kotlin-react-dom:${Versions.Js.Frontend.kotlinReactDom}"
            const val kotlinCss = "org.jetbrains:kotlin-css:${Versions.Js.Frontend.kotlinCss}"
            const val kotlinStyled = "org.jetbrains:kotlin-styled:${Versions.Js.Frontend.kotlinStyled}"
            const val kotlinReactRouting =
                "org.jetbrains:kotlin-react-router-dom:${Versions.Js.Frontend.kotlinReactRouting}"
            const val kotlinHtmlJs = "org.jetbrains.kotlinx:kotlinx-html-js:0.6.12"

            object Npm {

            }
        }
    }

    object Jvm {
        val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.kotlin}"


        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Kotlin.coroutines}"

    }

    object Common {
        val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.Kotlin.kotlin}"

        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.Kotlin.coroutines}"

    }
}