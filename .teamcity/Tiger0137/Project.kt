package Tiger0137

import Tiger0137.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0137")
    name = "Tiger0137"

    vcsRoot(Tiger0137_cVCSroot)
})
