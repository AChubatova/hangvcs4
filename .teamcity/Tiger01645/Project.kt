package Tiger01645

import Tiger01645.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01645")
    name = "Tiger01645"

    vcsRoot(Tiger01645_cVCSroot)
})
