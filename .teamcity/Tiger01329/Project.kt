package Tiger01329

import Tiger01329.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01329")
    name = "Tiger01329"

    vcsRoot(Tiger01329_cVCSroot)
})
