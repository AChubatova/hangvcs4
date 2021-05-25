package Tiger01338

import Tiger01338.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01338")
    name = "Tiger01338"

    vcsRoot(Tiger01338_cVCSroot)
})
