package Tiger01213

import Tiger01213.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01213")
    name = "Tiger01213"

    vcsRoot(Tiger01213_cVCSroot)
})
