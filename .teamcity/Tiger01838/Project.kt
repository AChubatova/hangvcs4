package Tiger01838

import Tiger01838.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01838")
    name = "Tiger01838"

    vcsRoot(Tiger01838_cVCSroot)
})
