package Tiger0144

import Tiger0144.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0144")
    name = "Tiger0144"

    vcsRoot(Tiger0144_cVCSroot)
})
