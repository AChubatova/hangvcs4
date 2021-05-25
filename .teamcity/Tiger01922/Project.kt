package Tiger01922

import Tiger01922.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01922")
    name = "Tiger01922"

    vcsRoot(Tiger01922_cVCSroot)
})
