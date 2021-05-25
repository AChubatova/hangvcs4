package Tiger01735

import Tiger01735.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01735")
    name = "Tiger01735"

    vcsRoot(Tiger01735_cVCSroot)
})
