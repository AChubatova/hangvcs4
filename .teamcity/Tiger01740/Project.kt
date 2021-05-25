package Tiger01740

import Tiger01740.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01740")
    name = "Tiger01740"

    vcsRoot(Tiger01740_cVCSroot)
})
