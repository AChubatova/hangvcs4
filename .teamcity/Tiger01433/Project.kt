package Tiger01433

import Tiger01433.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01433")
    name = "Tiger01433"

    vcsRoot(Tiger01433_cVCSroot)
})
