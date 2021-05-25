package Tiger01629

import Tiger01629.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01629")
    name = "Tiger01629"

    vcsRoot(Tiger01629_cVCSroot)
})
