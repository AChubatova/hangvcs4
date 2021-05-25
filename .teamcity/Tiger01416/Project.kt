package Tiger01416

import Tiger01416.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01416")
    name = "Tiger01416"

    vcsRoot(Tiger01416_cVCSroot)
})
