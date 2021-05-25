package Tiger01212

import Tiger01212.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01212")
    name = "Tiger01212"

    vcsRoot(Tiger01212_cVCSroot)
})
