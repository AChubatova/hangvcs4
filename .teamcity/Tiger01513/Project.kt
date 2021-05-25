package Tiger01513

import Tiger01513.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01513")
    name = "Tiger01513"

    vcsRoot(Tiger01513_cVCSroot)
})
