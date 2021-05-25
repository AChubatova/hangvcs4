package Tiger0135

import Tiger0135.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0135")
    name = "Tiger0135"

    vcsRoot(Tiger0135_cVCSroot)
})
