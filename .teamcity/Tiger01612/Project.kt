package Tiger01612

import Tiger01612.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01612")
    name = "Tiger01612"

    vcsRoot(Tiger01612_cVCSroot)
})
