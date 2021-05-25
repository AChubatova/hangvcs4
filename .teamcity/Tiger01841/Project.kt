package Tiger01841

import Tiger01841.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01841")
    name = "Tiger01841"

    vcsRoot(Tiger01841_cVCSroot)
})
