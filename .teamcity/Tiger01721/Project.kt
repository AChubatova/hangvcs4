package Tiger01721

import Tiger01721.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01721")
    name = "Tiger01721"

    vcsRoot(Tiger01721_cVCSroot)
})
