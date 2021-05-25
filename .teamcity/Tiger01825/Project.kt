package Tiger01825

import Tiger01825.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01825")
    name = "Tiger01825"

    vcsRoot(Tiger01825_cVCSroot)
})
