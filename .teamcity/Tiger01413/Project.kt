package Tiger01413

import Tiger01413.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01413")
    name = "Tiger01413"

    vcsRoot(Tiger01413_cVCSroot)
})
