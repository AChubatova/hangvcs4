package Tiger01615

import Tiger01615.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01615")
    name = "Tiger01615"

    vcsRoot(Tiger01615_cVCSroot)
})
