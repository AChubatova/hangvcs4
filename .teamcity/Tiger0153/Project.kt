package Tiger0153

import Tiger0153.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0153")
    name = "Tiger0153"

    vcsRoot(Tiger0153_cVCSroot)
})
