package Tiger01421

import Tiger01421.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01421")
    name = "Tiger01421"

    vcsRoot(Tiger01421_cVCSroot)
})
