package Tiger01337

import Tiger01337.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01337")
    name = "Tiger01337"

    vcsRoot(Tiger01337_cVCSroot)
})
