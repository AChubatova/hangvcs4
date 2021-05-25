package Tiger01733

import Tiger01733.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01733")
    name = "Tiger01733"

    vcsRoot(Tiger01733_cVCSroot)
})
