package Tiger01141

import Tiger01141.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01141")
    name = "Tiger01141"

    vcsRoot(Tiger01141_cVCSroot)
})
