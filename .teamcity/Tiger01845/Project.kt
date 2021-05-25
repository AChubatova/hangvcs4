package Tiger01845

import Tiger01845.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01845")
    name = "Tiger01845"

    vcsRoot(Tiger01845_cVCSroot)
})
