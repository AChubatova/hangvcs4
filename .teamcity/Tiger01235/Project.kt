package Tiger01235

import Tiger01235.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01235")
    name = "Tiger01235"

    vcsRoot(Tiger01235_cVCSroot)
})
