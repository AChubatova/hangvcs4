package Tiger01543

import Tiger01543.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01543")
    name = "Tiger01543"

    vcsRoot(Tiger01543_cVCSroot)
})
