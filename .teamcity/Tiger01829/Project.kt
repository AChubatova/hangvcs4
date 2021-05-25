package Tiger01829

import Tiger01829.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01829")
    name = "Tiger01829"

    vcsRoot(Tiger01829_cVCSroot)
})
