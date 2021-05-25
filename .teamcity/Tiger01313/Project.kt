package Tiger01313

import Tiger01313.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01313")
    name = "Tiger01313"

    vcsRoot(Tiger01313_cVCSroot)
})
