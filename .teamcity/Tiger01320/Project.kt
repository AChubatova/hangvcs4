package Tiger01320

import Tiger01320.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01320")
    name = "Tiger01320"

    vcsRoot(Tiger01320_cVCSroot)
})
