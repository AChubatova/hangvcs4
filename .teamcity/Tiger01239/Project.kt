package Tiger01239

import Tiger01239.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01239")
    name = "Tiger01239"

    vcsRoot(Tiger01239_cVCSroot)
})
