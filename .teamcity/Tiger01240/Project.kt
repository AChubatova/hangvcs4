package Tiger01240

import Tiger01240.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01240")
    name = "Tiger01240"

    vcsRoot(Tiger01240_cVCSroot)
})
