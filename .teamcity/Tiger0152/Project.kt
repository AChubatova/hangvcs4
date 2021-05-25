package Tiger0152

import Tiger0152.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0152")
    name = "Tiger0152"

    vcsRoot(Tiger0152_cVCSroot)
})
