package Tiger01328

import Tiger01328.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01328")
    name = "Tiger01328"

    vcsRoot(Tiger01328_cVCSroot)
})
