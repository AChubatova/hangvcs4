package Tiger01510

import Tiger01510.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01510")
    name = "Tiger01510"

    vcsRoot(Tiger01510_cVCSroot)
})
