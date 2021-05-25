package Tiger01216

import Tiger01216.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01216")
    name = "Tiger01216"

    vcsRoot(Tiger01216_cVCSroot)
})
