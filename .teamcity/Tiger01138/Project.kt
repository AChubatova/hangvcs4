package Tiger01138

import Tiger01138.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01138")
    name = "Tiger01138"

    vcsRoot(Tiger01138_cVCSroot)
})
