package Tiger01843

import Tiger01843.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01843")
    name = "Tiger01843"

    vcsRoot(Tiger01843_cVCSroot)
})
