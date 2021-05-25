package Tiger01811

import Tiger01811.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01811")
    name = "Tiger01811"

    vcsRoot(Tiger01811_cVCSroot)
})
