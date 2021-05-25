package Tiger01642

import Tiger01642.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01642")
    name = "Tiger01642"

    vcsRoot(Tiger01642_cVCSroot)
})
