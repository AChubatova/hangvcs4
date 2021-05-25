package Tiger01844

import Tiger01844.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01844")
    name = "Tiger01844"

    vcsRoot(Tiger01844_cVCSroot)
})
