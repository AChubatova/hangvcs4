package Tiger01614

import Tiger01614.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01614")
    name = "Tiger01614"

    vcsRoot(Tiger01614_cVCSroot)
})
