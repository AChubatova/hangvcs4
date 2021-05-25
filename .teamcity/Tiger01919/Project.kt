package Tiger01919

import Tiger01919.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01919")
    name = "Tiger01919"

    vcsRoot(Tiger01919_cVCSroot)
})
