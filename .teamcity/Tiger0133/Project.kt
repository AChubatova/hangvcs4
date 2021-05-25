package Tiger0133

import Tiger0133.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0133")
    name = "Tiger0133"

    vcsRoot(Tiger0133_cVCSroot)
})
