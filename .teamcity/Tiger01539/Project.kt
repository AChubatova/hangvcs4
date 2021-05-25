package Tiger01539

import Tiger01539.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01539")
    name = "Tiger01539"

    vcsRoot(Tiger01539_cVCSroot)
})
