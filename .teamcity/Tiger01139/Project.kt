package Tiger01139

import Tiger01139.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01139")
    name = "Tiger01139"

    vcsRoot(Tiger01139_cVCSroot)
})
