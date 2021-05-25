package Tiger01531

import Tiger01531.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01531")
    name = "Tiger01531"

    vcsRoot(Tiger01531_cVCSroot)
})
