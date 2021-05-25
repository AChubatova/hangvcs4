package Tiger01323

import Tiger01323.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01323")
    name = "Tiger01323"

    vcsRoot(Tiger01323_cVCSroot)
})
