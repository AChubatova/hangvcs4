package Tiger01540

import Tiger01540.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01540")
    name = "Tiger01540"

    vcsRoot(Tiger01540_cVCSroot)
})
