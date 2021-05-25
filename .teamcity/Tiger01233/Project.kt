package Tiger01233

import Tiger01233.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01233")
    name = "Tiger01233"

    vcsRoot(Tiger01233_cVCSroot)
})
