package Tiger01446

import Tiger01446.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01446")
    name = "Tiger01446"

    vcsRoot(Tiger01446_cVCSroot)
})
