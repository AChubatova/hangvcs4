package Tiger01525

import Tiger01525.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01525")
    name = "Tiger01525"

    vcsRoot(Tiger01525_cVCSroot)
})
