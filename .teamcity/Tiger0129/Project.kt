package Tiger0129

import Tiger0129.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0129")
    name = "Tiger0129"

    vcsRoot(Tiger0129_cVCSroot)
})
