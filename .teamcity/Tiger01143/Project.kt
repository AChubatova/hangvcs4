package Tiger01143

import Tiger01143.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01143")
    name = "Tiger01143"

    vcsRoot(Tiger01143_cVCSroot)
})
