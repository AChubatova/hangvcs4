package Tiger01541

import Tiger01541.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01541")
    name = "Tiger01541"

    vcsRoot(Tiger01541_cVCSroot)
})
