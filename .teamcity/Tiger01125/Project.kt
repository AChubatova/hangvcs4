package Tiger01125

import Tiger01125.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01125")
    name = "Tiger01125"

    vcsRoot(Tiger01125_cVCSroot)
})
