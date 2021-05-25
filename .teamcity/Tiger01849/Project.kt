package Tiger01849

import Tiger01849.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01849")
    name = "Tiger01849"

    vcsRoot(Tiger01849_cVCSroot)
})
