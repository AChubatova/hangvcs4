package Tiger01517

import Tiger01517.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01517")
    name = "Tiger01517"

    vcsRoot(Tiger01517_cVCSroot)
})
