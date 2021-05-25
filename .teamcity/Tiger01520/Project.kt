package Tiger01520

import Tiger01520.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01520")
    name = "Tiger01520"

    vcsRoot(Tiger01520_cVCSroot)
})
