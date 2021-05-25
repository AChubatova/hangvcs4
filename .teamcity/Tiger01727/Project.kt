package Tiger01727

import Tiger01727.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01727")
    name = "Tiger01727"

    vcsRoot(Tiger01727_cVCSroot)
})
