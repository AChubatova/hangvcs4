package Tiger01347

import Tiger01347.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01347")
    name = "Tiger01347"

    vcsRoot(Tiger01347_cVCSroot)
})
