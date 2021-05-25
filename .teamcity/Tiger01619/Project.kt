package Tiger01619

import Tiger01619.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01619")
    name = "Tiger01619"

    vcsRoot(Tiger01619_cVCSroot)
})
