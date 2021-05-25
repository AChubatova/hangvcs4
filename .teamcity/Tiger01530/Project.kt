package Tiger01530

import Tiger01530.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01530")
    name = "Tiger01530"

    vcsRoot(Tiger01530_cVCSroot)
})
