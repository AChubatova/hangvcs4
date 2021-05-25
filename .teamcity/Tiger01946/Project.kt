package Tiger01946

import Tiger01946.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01946")
    name = "Tiger01946"

    vcsRoot(Tiger01946_cVCSroot)
})
