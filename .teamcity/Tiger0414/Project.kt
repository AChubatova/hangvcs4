package Tiger0414

import Tiger0414.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0414")
    name = "Tiger0414"

    vcsRoot(Tiger0414_cVCSroot)
})
