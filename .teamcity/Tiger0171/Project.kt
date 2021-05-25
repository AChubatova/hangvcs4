package Tiger0171

import Tiger0171.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0171")
    name = "Tiger0171"

    vcsRoot(Tiger0171_cVCSroot)
})
