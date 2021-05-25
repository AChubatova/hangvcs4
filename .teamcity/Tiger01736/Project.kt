package Tiger01736

import Tiger01736.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01736")
    name = "Tiger01736"

    vcsRoot(Tiger01736_cVCSroot)
})
