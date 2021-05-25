package Tiger0125

import Tiger0125.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0125")
    name = "Tiger0125"

    vcsRoot(Tiger0125_cVCSroot)
})
