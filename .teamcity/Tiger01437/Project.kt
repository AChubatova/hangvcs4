package Tiger01437

import Tiger01437.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01437")
    name = "Tiger01437"

    vcsRoot(Tiger01437_cVCSroot)
})
