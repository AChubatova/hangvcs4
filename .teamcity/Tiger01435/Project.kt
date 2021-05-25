package Tiger01435

import Tiger01435.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01435")
    name = "Tiger01435"

    vcsRoot(Tiger01435_cVCSroot)
})
