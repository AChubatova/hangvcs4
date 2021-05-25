package Tiger01420

import Tiger01420.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01420")
    name = "Tiger01420"

    vcsRoot(Tiger01420_cVCSroot)
})
