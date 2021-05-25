package Tiger01439

import Tiger01439.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01439")
    name = "Tiger01439"

    vcsRoot(Tiger01439_cVCSroot)
})
