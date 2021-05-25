package Tiger01848

import Tiger01848.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01848")
    name = "Tiger01848"

    vcsRoot(Tiger01848_cVCSroot)
})
