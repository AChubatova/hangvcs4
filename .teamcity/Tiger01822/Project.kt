package Tiger01822

import Tiger01822.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01822")
    name = "Tiger01822"

    vcsRoot(Tiger01822_cVCSroot)
})
