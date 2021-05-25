package Tiger01818

import Tiger01818.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01818")
    name = "Tiger01818"

    vcsRoot(Tiger01818_cVCSroot)
})
