package Tiger01418

import Tiger01418.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01418")
    name = "Tiger01418"

    vcsRoot(Tiger01418_cVCSroot)
})
