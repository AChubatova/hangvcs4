package Tiger01417

import Tiger01417.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01417")
    name = "Tiger01417"

    vcsRoot(Tiger01417_cVCSroot)
})
