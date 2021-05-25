package Tiger01925

import Tiger01925.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01925")
    name = "Tiger01925"

    vcsRoot(Tiger01925_cVCSroot)
})
