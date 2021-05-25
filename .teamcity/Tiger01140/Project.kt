package Tiger01140

import Tiger01140.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01140")
    name = "Tiger01140"

    vcsRoot(Tiger01140_cVCSroot)
})
