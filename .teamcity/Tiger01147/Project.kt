package Tiger01147

import Tiger01147.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01147")
    name = "Tiger01147"

    vcsRoot(Tiger01147_cVCSroot)
})
