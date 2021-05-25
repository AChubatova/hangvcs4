package Tiger0169

import Tiger0169.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0169")
    name = "Tiger0169"

    vcsRoot(Tiger0169_cVCSroot)
})
