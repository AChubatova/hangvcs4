package Tiger01731

import Tiger01731.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01731")
    name = "Tiger01731"

    vcsRoot(Tiger01731_cVCSroot)
})
