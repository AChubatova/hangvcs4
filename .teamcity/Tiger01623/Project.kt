package Tiger01623

import Tiger01623.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01623")
    name = "Tiger01623"

    vcsRoot(Tiger01623_cVCSroot)
})
