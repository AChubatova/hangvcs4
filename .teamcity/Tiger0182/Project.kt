package Tiger0182

import Tiger0182.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0182")
    name = "Tiger0182"

    vcsRoot(Tiger0182_cVCSroot)
})
