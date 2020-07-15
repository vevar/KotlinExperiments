object Modules {

    object App {

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

