package Tiger01535

import Tiger01535.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01535")
    name = "Tiger01535"

    vcsRoot(Tiger01535_cVCSroot)
})
