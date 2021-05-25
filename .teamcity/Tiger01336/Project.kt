package Tiger01336

import Tiger01336.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01336")
    name = "Tiger01336"

    vcsRoot(Tiger01336_cVCSroot)
})
