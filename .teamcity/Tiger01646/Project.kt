package Tiger01646

import Tiger01646.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01646")
    name = "Tiger01646"

    vcsRoot(Tiger01646_cVCSroot)
})
