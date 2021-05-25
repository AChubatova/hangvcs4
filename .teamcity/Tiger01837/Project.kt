package Tiger01837

import Tiger01837.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01837")
    name = "Tiger01837"

    vcsRoot(Tiger01837_cVCSroot)
})
