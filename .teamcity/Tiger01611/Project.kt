package Tiger01611

import Tiger01611.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01611")
    name = "Tiger01611"

    vcsRoot(Tiger01611_cVCSroot)
})
