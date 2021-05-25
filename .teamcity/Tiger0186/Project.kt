package Tiger0186

import Tiger0186.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0186")
    name = "Tiger0186"

    vcsRoot(Tiger0186_cVCSroot)
})
