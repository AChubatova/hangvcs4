package Tiger01926

import Tiger01926.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01926")
    name = "Tiger01926"

    vcsRoot(Tiger01926_cVCSroot)
})
