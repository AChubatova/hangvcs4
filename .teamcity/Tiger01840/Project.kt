package Tiger01840

import Tiger01840.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01840")
    name = "Tiger01840"

    vcsRoot(Tiger01840_cVCSroot)
})
