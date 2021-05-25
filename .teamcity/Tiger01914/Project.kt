package Tiger01914

import Tiger01914.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01914")
    name = "Tiger01914"

    vcsRoot(Tiger01914_cVCSroot)
})
