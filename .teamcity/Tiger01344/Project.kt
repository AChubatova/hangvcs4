package Tiger01344

import Tiger01344.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01344")
    name = "Tiger01344"

    vcsRoot(Tiger01344_cVCSroot)
})
