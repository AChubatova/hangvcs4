package Tiger01330

import Tiger01330.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01330")
    name = "Tiger01330"

    vcsRoot(Tiger01330_cVCSroot)
})
