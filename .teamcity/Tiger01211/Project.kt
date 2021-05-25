package Tiger01211

import Tiger01211.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01211")
    name = "Tiger01211"

    vcsRoot(Tiger01211_cVCSroot)
})
