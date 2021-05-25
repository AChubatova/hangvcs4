package Tiger01422

import Tiger01422.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01422")
    name = "Tiger01422"

    vcsRoot(Tiger01422_cVCSroot)
})
