package Tiger01620

import Tiger01620.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01620")
    name = "Tiger01620"

    vcsRoot(Tiger01620_cVCSroot)
})
