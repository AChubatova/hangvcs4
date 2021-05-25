package Tiger01226

import Tiger01226.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01226")
    name = "Tiger01226"

    vcsRoot(Tiger01226_cVCSroot)
})
