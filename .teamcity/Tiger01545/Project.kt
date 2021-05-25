package Tiger01545

import Tiger01545.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01545")
    name = "Tiger01545"

    vcsRoot(Tiger01545_cVCSroot)
})
