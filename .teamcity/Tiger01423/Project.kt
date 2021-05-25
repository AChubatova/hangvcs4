package Tiger01423

import Tiger01423.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01423")
    name = "Tiger01423"

    vcsRoot(Tiger01423_cVCSroot)
})
