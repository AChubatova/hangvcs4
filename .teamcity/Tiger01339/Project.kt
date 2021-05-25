package Tiger01339

import Tiger01339.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01339")
    name = "Tiger01339"

    vcsRoot(Tiger01339_cVCSroot)
})
