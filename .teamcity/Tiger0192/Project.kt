package Tiger0192

import Tiger0192.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0192")
    name = "Tiger0192"

    vcsRoot(Tiger0192_cVCSroot)
})
