package Tiger01939

import Tiger01939.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01939")
    name = "Tiger01939"

    vcsRoot(Tiger01939_cVCSroot)
})
