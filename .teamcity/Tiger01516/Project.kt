package Tiger01516

import Tiger01516.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01516")
    name = "Tiger01516"

    vcsRoot(Tiger01516_cVCSroot)
})
