package Tiger01318

import Tiger01318.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01318")
    name = "Tiger01318"

    vcsRoot(Tiger01318_cVCSroot)
})
