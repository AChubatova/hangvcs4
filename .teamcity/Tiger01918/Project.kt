package Tiger01918

import Tiger01918.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01918")
    name = "Tiger01918"

    vcsRoot(Tiger01918_cVCSroot)
})
