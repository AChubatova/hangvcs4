package Tiger0185

import Tiger0185.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0185")
    name = "Tiger0185"

    vcsRoot(Tiger0185_cVCSroot)
})
