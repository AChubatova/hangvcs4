package Tiger01937

import Tiger01937.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01937")
    name = "Tiger01937"

    vcsRoot(Tiger01937_cVCSroot)
})
