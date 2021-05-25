package Tiger01312

import Tiger01312.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01312")
    name = "Tiger01312"

    vcsRoot(Tiger01312_cVCSroot)
})
