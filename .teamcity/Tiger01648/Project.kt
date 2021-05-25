package Tiger01648

import Tiger01648.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01648")
    name = "Tiger01648"

    vcsRoot(Tiger01648_cVCSroot)
})
