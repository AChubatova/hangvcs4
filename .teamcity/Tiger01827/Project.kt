package Tiger01827

import Tiger01827.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01827")
    name = "Tiger01827"

    vcsRoot(Tiger01827_cVCSroot)
})
