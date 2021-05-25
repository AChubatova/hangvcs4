package Tiger0178

import Tiger0178.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0178")
    name = "Tiger0178"

    vcsRoot(Tiger0178_cVCSroot)
})
