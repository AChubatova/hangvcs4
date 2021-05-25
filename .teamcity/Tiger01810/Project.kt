package Tiger01810

import Tiger01810.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01810")
    name = "Tiger01810"

    vcsRoot(Tiger01810_cVCSroot)
})
