package Tiger01342

import Tiger01342.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01342")
    name = "Tiger01342"

    vcsRoot(Tiger01342_cVCSroot)
})
