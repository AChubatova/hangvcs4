package Tiger01322

import Tiger01322.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01322")
    name = "Tiger01322"

    vcsRoot(Tiger01322_cVCSroot)
})
