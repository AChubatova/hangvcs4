package Tiger01210

import Tiger01210.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01210")
    name = "Tiger01210"

    vcsRoot(Tiger01210_cVCSroot)
})
