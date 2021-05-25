package Tiger01618

import Tiger01618.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01618")
    name = "Tiger01618"

    vcsRoot(Tiger01618_cVCSroot)
})
