package Tiger01814

import Tiger01814.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01814")
    name = "Tiger01814"

    vcsRoot(Tiger01814_cVCSroot)
})
