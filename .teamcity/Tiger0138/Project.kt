package Tiger0138

import Tiger0138.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0138")
    name = "Tiger0138"

    vcsRoot(Tiger0138_cVCSroot)
})
