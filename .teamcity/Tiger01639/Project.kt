package Tiger01639

import Tiger01639.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01639")
    name = "Tiger01639"

    vcsRoot(Tiger01639_cVCSroot)
})
