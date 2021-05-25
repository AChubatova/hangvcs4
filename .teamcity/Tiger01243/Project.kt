package Tiger01243

import Tiger01243.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01243")
    name = "Tiger01243"

    vcsRoot(Tiger01243_cVCSroot)
})
