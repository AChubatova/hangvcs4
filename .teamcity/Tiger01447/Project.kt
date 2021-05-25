package Tiger01447

import Tiger01447.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01447")
    name = "Tiger01447"

    vcsRoot(Tiger01447_cVCSroot)
})
