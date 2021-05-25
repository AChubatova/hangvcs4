package Tiger0174

import Tiger0174.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0174")
    name = "Tiger0174"

    vcsRoot(Tiger0174_cVCSroot)
})
