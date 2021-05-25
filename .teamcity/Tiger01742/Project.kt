package Tiger01742

import Tiger01742.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01742")
    name = "Tiger01742"

    vcsRoot(Tiger01742_cVCSroot)
})
