package Tiger01511

import Tiger01511.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01511")
    name = "Tiger01511"

    vcsRoot(Tiger01511_cVCSroot)
})
