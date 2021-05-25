package Tiger01839

import Tiger01839.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01839")
    name = "Tiger01839"

    vcsRoot(Tiger01839_cVCSroot)
})
