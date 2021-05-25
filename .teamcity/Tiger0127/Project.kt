package Tiger0127

import Tiger0127.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0127")
    name = "Tiger0127"

    vcsRoot(Tiger0127_cVCSroot)
})
