package Tiger01649

import Tiger01649.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01649")
    name = "Tiger01649"

    vcsRoot(Tiger01649_cVCSroot)
})
