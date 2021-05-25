package Tiger01812

import Tiger01812.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01812")
    name = "Tiger01812"

    vcsRoot(Tiger01812_cVCSroot)
})
