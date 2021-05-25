package Tiger01711

import Tiger01711.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01711")
    name = "Tiger01711"

    vcsRoot(Tiger01711_cVCSroot)
})
