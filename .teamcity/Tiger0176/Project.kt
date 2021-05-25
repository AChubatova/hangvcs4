package Tiger0176

import Tiger0176.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0176")
    name = "Tiger0176"

    vcsRoot(Tiger0176_cVCSroot)
})
