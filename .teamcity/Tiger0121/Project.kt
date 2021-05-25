package Tiger0121

import Tiger0121.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0121")
    name = "Tiger0121"

    vcsRoot(Tiger0121_cVCSroot)
})
