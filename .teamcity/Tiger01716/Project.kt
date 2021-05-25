package Tiger01716

import Tiger01716.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01716")
    name = "Tiger01716"

    vcsRoot(Tiger01716_cVCSroot)
})
