package Tiger01346

import Tiger01346.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01346")
    name = "Tiger01346"

    vcsRoot(Tiger01346_cVCSroot)
})
