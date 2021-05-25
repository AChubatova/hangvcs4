package Tiger01219

import Tiger01219.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01219")
    name = "Tiger01219"

    vcsRoot(Tiger01219_cVCSroot)
})
