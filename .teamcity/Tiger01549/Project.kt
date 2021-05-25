package Tiger01549

import Tiger01549.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01549")
    name = "Tiger01549"

    vcsRoot(Tiger01549_cVCSroot)
})
