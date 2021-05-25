package Tiger01913

import Tiger01913.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01913")
    name = "Tiger01913"

    vcsRoot(Tiger01913_cVCSroot)
})
