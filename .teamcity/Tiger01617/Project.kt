package Tiger01617

import Tiger01617.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01617")
    name = "Tiger01617"

    vcsRoot(Tiger01617_cVCSroot)
})
