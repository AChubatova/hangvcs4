package Tiger01644

import Tiger01644.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01644")
    name = "Tiger01644"

    vcsRoot(Tiger01644_cVCSroot)
})
