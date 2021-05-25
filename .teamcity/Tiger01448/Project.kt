package Tiger01448

import Tiger01448.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01448")
    name = "Tiger01448"

    vcsRoot(Tiger01448_cVCSroot)
})
