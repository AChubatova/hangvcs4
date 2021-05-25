package Tiger01741

import Tiger01741.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01741")
    name = "Tiger01741"

    vcsRoot(Tiger01741_cVCSroot)
})
