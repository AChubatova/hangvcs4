package Tiger01734

import Tiger01734.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01734")
    name = "Tiger01734"

    vcsRoot(Tiger01734_cVCSroot)
})
