package Tiger0195

import Tiger0195.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0195")
    name = "Tiger0195"

    vcsRoot(Tiger0195_cVCSroot)
})
