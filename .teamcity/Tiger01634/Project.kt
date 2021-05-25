package Tiger01634

import Tiger01634.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01634")
    name = "Tiger01634"

    vcsRoot(Tiger01634_cVCSroot)
})
