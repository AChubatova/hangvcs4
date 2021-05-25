package Tiger01637

import Tiger01637.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01637")
    name = "Tiger01637"

    vcsRoot(Tiger01637_cVCSroot)
})
