package Tiger01632

import Tiger01632.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01632")
    name = "Tiger01632"

    vcsRoot(Tiger01632_cVCSroot)
})
