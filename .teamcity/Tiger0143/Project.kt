package Tiger0143

import Tiger0143.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0143")
    name = "Tiger0143"

    vcsRoot(Tiger0143_cVCSroot)
})
