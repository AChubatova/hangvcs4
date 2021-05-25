package Tiger01820

import Tiger01820.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01820")
    name = "Tiger01820"

    vcsRoot(Tiger01820_cVCSroot)
})
