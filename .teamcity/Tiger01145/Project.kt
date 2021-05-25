package Tiger01145

import Tiger01145.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01145")
    name = "Tiger01145"

    vcsRoot(Tiger01145_cVCSroot)
})
