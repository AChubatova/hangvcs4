package Tiger01920

import Tiger01920.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01920")
    name = "Tiger01920"

    vcsRoot(Tiger01920_cVCSroot)
})
