package Tiger01533

import Tiger01533.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01533")
    name = "Tiger01533"

    vcsRoot(Tiger01533_cVCSroot)
})
