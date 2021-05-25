package Tiger01610

import Tiger01610.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01610")
    name = "Tiger01610"

    vcsRoot(Tiger01610_cVCSroot)
})
