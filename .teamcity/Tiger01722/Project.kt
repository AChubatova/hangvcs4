package Tiger01722

import Tiger01722.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01722")
    name = "Tiger01722"

    vcsRoot(Tiger01722_cVCSroot)
})
