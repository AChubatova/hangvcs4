package Tiger01823

import Tiger01823.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01823")
    name = "Tiger01823"

    vcsRoot(Tiger01823_cVCSroot)
})
