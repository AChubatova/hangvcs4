package Tiger01247

import Tiger01247.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01247")
    name = "Tiger01247"

    vcsRoot(Tiger01247_cVCSroot)
})
