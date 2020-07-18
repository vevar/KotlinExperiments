rootProject.name = "notes"


include(":notes:channel")

Modules.App.FullStackJs.modules.forEach {
    include(it)
}
