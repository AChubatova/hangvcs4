package Tiger01537

import Tiger01537.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01537")
    name = "Tiger01537"

    vcsRoot(Tiger01537_cVCSroot)
})
