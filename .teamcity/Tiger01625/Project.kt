package Tiger01625

import Tiger01625.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01625")
    name = "Tiger01625"

    vcsRoot(Tiger01625_cVCSroot)
})
