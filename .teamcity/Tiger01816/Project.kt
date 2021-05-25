package Tiger01816

import Tiger01816.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01816")
    name = "Tiger01816"

    vcsRoot(Tiger01816_cVCSroot)
})
