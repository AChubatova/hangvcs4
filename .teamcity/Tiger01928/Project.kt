package Tiger01928

import Tiger01928.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01928")
    name = "Tiger01928"

    vcsRoot(Tiger01928_cVCSroot)
})
