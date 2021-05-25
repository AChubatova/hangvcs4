package Tiger0136

import Tiger0136.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0136")
    name = "Tiger0136"

    vcsRoot(Tiger0136_cVCSroot)
})
