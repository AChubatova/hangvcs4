package Tiger01334

import Tiger01334.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01334")
    name = "Tiger01334"

    vcsRoot(Tiger01334_cVCSroot)
})
