package Tiger01621

import Tiger01621.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01621")
    name = "Tiger01621"

    vcsRoot(Tiger01621_cVCSroot)
})
