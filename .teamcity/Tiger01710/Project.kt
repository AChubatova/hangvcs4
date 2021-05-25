package Tiger01710

import Tiger01710.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01710")
    name = "Tiger01710"

    vcsRoot(Tiger01710_cVCSroot)
})
