package Tiger01833

import Tiger01833.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01833")
    name = "Tiger01833"

    vcsRoot(Tiger01833_cVCSroot)
})
