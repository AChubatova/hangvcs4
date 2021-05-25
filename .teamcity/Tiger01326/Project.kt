package Tiger01326

import Tiger01326.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01326")
    name = "Tiger01326"

    vcsRoot(Tiger01326_cVCSroot)
})
