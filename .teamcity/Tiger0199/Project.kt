package Tiger0199

import Tiger0199.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0199")
    name = "Tiger0199"

    vcsRoot(Tiger0199_cVCSroot)
})
