package Tiger01949

import Tiger01949.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01949")
    name = "Tiger01949"

    vcsRoot(Tiger01949_cVCSroot)
})
