package Tiger01842

import Tiger01842.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01842")
    name = "Tiger01842"

    vcsRoot(Tiger01842_cVCSroot)
})
