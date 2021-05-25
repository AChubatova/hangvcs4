package Tiger01815

import Tiger01815.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01815")
    name = "Tiger01815"

    vcsRoot(Tiger01815_cVCSroot)
})
