package Tiger01934

import Tiger01934.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01934")
    name = "Tiger01934"

    vcsRoot(Tiger01934_cVCSroot)
})
