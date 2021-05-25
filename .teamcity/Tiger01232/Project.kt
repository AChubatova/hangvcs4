package Tiger01232

import Tiger01232.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01232")
    name = "Tiger01232"

    vcsRoot(Tiger01232_cVCSroot)
})
