object Modules {

    object App {
        object FullStackJs {
            val root = ":app:fullstack-js"
            val client = "$root:client"
            val server = "$root:server"

            val domain = "$root:domain"
            val feature = "$root:feature"

            val modules = listOf(root, client, server, domain, feature)
        }
    }

    const val domain = ":domain"


    object Feature {

        const val feature = ":feature"
        const val shared = ":shared"
        const val navigation = "${feature}:navigation"

        val features = arrayOf(
            feature,
            navigation,
            shared
        )
    }


}

