package Tiger01518

import Tiger01518.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01518")
    name = "Tiger01518"

    vcsRoot(Tiger01518_cVCSroot)
})
