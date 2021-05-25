package Tiger01311

import Tiger01311.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01311")
    name = "Tiger01311"

    vcsRoot(Tiger01311_cVCSroot)
})
