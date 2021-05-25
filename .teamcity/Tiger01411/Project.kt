package Tiger01411

import Tiger01411.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01411")
    name = "Tiger01411"

    vcsRoot(Tiger01411_cVCSroot)
})
