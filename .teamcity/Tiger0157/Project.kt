package Tiger0157

import Tiger0157.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0157")
    name = "Tiger0157"

    vcsRoot(Tiger0157_cVCSroot)
})
