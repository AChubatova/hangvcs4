package Tiger01310

import Tiger01310.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01310")
    name = "Tiger01310"

    vcsRoot(Tiger01310_cVCSroot)
})
