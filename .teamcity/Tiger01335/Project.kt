package Tiger01335

import Tiger01335.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01335")
    name = "Tiger01335"

    vcsRoot(Tiger01335_cVCSroot)
})
