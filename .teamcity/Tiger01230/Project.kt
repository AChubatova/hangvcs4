package Tiger01230

import Tiger01230.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01230")
    name = "Tiger01230"

    vcsRoot(Tiger01230_cVCSroot)
})
