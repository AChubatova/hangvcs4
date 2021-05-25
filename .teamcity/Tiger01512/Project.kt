package Tiger01512

import Tiger01512.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01512")
    name = "Tiger01512"

    vcsRoot(Tiger01512_cVCSroot)
})
