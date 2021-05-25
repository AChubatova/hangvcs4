package Tiger01440

import Tiger01440.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01440")
    name = "Tiger01440"

    vcsRoot(Tiger01440_cVCSroot)
})
