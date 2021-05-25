package Tiger01244

import Tiger01244.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01244")
    name = "Tiger01244"

    vcsRoot(Tiger01244_cVCSroot)
})
