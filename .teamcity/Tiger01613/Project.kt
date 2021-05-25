package Tiger01613

import Tiger01613.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01613")
    name = "Tiger01613"

    vcsRoot(Tiger01613_cVCSroot)
})
