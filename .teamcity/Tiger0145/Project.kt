package Tiger0145

import Tiger0145.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0145")
    name = "Tiger0145"

    vcsRoot(Tiger0145_cVCSroot)
})
