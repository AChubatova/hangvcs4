package Tiger0130

import Tiger0130.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0130")
    name = "Tiger0130"

    vcsRoot(Tiger0130_cVCSroot)
})
