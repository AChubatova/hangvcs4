package Tiger01429

import Tiger01429.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01429")
    name = "Tiger01429"

    vcsRoot(Tiger01429_cVCSroot)
})
