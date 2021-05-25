package Tiger01349

import Tiger01349.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01349")
    name = "Tiger01349"

    vcsRoot(Tiger01349_cVCSroot)
})
