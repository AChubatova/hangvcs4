package Tiger01730

import Tiger01730.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01730")
    name = "Tiger01730"

    vcsRoot(Tiger01730_cVCSroot)
})
