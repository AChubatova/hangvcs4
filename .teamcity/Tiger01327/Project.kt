package Tiger01327

import Tiger01327.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01327")
    name = "Tiger01327"

    vcsRoot(Tiger01327_cVCSroot)
})
