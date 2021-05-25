package Tiger01146

import Tiger01146.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01146")
    name = "Tiger01146"

    vcsRoot(Tiger01146_cVCSroot)
})
