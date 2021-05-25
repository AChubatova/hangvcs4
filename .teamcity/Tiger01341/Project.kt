package Tiger01341

import Tiger01341.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01341")
    name = "Tiger01341"

    vcsRoot(Tiger01341_cVCSroot)
})
