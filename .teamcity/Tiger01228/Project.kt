package Tiger01228

import Tiger01228.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01228")
    name = "Tiger01228"

    vcsRoot(Tiger01228_cVCSroot)
})
