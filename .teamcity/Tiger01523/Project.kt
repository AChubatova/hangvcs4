package Tiger01523

import Tiger01523.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01523")
    name = "Tiger01523"

    vcsRoot(Tiger01523_cVCSroot)
})
