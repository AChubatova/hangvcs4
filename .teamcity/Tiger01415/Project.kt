package Tiger01415

import Tiger01415.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01415")
    name = "Tiger01415"

    vcsRoot(Tiger01415_cVCSroot)
})
