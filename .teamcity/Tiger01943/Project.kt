package Tiger01943

import Tiger01943.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01943")
    name = "Tiger01943"

    vcsRoot(Tiger01943_cVCSroot)
})
