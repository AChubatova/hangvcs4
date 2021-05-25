package Tiger0193

import Tiger0193.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0193")
    name = "Tiger0193"

    vcsRoot(Tiger0193_cVCSroot)
})
