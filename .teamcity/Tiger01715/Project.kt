package Tiger01715

import Tiger01715.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01715")
    name = "Tiger01715"

    vcsRoot(Tiger01715_cVCSroot)
})
