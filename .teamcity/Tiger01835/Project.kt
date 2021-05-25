package Tiger01835

import Tiger01835.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01835")
    name = "Tiger01835"

    vcsRoot(Tiger01835_cVCSroot)
})
