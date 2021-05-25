package Tiger01640

import Tiger01640.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01640")
    name = "Tiger01640"

    vcsRoot(Tiger01640_cVCSroot)
})
