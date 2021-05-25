package Tiger01743

import Tiger01743.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01743")
    name = "Tiger01743"

    vcsRoot(Tiger01743_cVCSroot)
})
