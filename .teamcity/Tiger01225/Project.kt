package Tiger01225

import Tiger01225.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01225")
    name = "Tiger01225"

    vcsRoot(Tiger01225_cVCSroot)
})
