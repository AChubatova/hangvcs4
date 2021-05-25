package Tiger01748

import Tiger01748.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01748")
    name = "Tiger01748"

    vcsRoot(Tiger01748_cVCSroot)
})
