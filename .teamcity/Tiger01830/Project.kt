package Tiger01830

import Tiger01830.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01830")
    name = "Tiger01830"

    vcsRoot(Tiger01830_cVCSroot)
})
