package Tiger01023

import Tiger01023.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01023")
    name = "Tiger01023"

    vcsRoot(Tiger01023_cVCSroot)
})
