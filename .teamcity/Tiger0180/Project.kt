package Tiger0180

import Tiger0180.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0180")
    name = "Tiger0180"

    vcsRoot(Tiger0180_cVCSroot)
})
