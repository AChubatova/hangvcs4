package Tiger01246

import Tiger01246.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01246")
    name = "Tiger01246"

    vcsRoot(Tiger01246_cVCSroot)
})
