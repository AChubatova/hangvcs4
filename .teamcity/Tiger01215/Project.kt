package Tiger01215

import Tiger01215.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01215")
    name = "Tiger01215"

    vcsRoot(Tiger01215_cVCSroot)
})
