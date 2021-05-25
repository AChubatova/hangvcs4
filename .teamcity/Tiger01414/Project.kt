package Tiger01414

import Tiger01414.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01414")
    name = "Tiger01414"

    vcsRoot(Tiger01414_cVCSroot)
})
