package Tiger01149

import Tiger01149.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01149")
    name = "Tiger01149"

    vcsRoot(Tiger01149_cVCSroot)
})
