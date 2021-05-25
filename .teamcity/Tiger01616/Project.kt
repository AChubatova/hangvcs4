package Tiger01616

import Tiger01616.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01616")
    name = "Tiger01616"

    vcsRoot(Tiger01616_cVCSroot)
})
