package Tiger01314

import Tiger01314.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01314")
    name = "Tiger01314"

    vcsRoot(Tiger01314_cVCSroot)
})
