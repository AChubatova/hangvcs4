package Tiger01529

import Tiger01529.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01529")
    name = "Tiger01529"

    vcsRoot(Tiger01529_cVCSroot)
})
