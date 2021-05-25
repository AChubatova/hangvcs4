package Tiger01410

import Tiger01410.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01410")
    name = "Tiger01410"

    vcsRoot(Tiger01410_cVCSroot)
})
