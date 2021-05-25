package Tiger0126

import Tiger0126.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0126")
    name = "Tiger0126"

    vcsRoot(Tiger0126_cVCSroot)
})
