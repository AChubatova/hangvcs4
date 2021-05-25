package Tiger0122

import Tiger0122.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0122")
    name = "Tiger0122"

    vcsRoot(Tiger0122_cVCSroot)
})
