package Tiger0150

import Tiger0150.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0150")
    name = "Tiger0150"

    vcsRoot(Tiger0150_cVCSroot)
})
